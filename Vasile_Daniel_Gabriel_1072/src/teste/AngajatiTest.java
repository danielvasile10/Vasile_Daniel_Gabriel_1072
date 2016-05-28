package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Angajati;

public class AngajatiTest {
	Angajati a = new Angajati("Daniel","CEO",10000,"0724890414");
	Angajati sefBucatarie = new Angajati("Marius","Bucatarie",3000,"0272354389");
	private List<Angajati> listSubordonati ;
	

	//test pentru verificare bonus
	@Test
	public void testCalculeazaBonus() throws Exception
	{
		int bonus = a.calculeazaBonus(a);
		assertEquals(200, bonus);
	}
	
	//test salariu anual
	@Test
	public void testCalculeazaSalariuAnual() throws Exception 
	{
		
		int salariuAnual = a.calculeazaSalariuAnual(a);
		assertEquals(120000,salariuAnual);
	}
	
	@Test
	public void testCalculeazaSalariuAnual2() throws Exception 
	{
		int salariuAnual = a.calculeazaSalariuAnual(a);
		assertNotNull(salariuAnual);
	}
	
	@Before
	public void setUp()
	{
		listSubordonati = new ArrayList<Angajati>();
	}
	
	@Test
	public void testMetodaAdaugareColectie()
	{
		a.addAngajat(sefBucatarie);
		assertEquals("dimensiune gresita", 1, a.listSubordonati.size());
	}
	
	@Test   
	public void testMetodaStergereColectie() 
	{
		a.addAngajat(sefBucatarie);
		assertEquals("dimensiune gresita", 1, a.listSubordonati.size());
		a.removeAngajat(sefBucatarie);
		assertEquals("dimensiune gresita , stergere nereusita", 0, a.listSubordonati.size());
	}
	
	@After
	public void tearDown() throws Exception {
		listSubordonati.clear();
	}
	
	@Test
	public void testColectieLibera()
	{
		assertTrue(a.listSubordonati.isEmpty());
	}
	
	@Test
	public void testSetNume()
	{
		a.setNume("Daniel");
		assertNotNull(a.getNume());
	}
	
	@Test 
	public void testPrimaLiteraMare()
	{
		a.setNume("Daniel");
		assertTrue(Character.isUpperCase(a.getNume().charAt(0)));
		
	}
	
	@Test
	public void testValoareNegativaSalariu()
	{
		Angajati a1 = new Angajati("Daniel","CEO",10000,"0724890414");
		try {
			a1.setSalariu(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestIntervalSalariuSub()
	{
		Angajati a1 = new Angajati("Daniel","CEO",10000,"0724890414");
		try {
			a1.setSalariu(1500);
			fail("Valoare salariu in afara intervalului");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIntervalSalariuPeste()
	{
		Angajati a1 = new Angajati("Daniel","CEO",10000,"0724890414");
		try {
			a1.setSalariu(15500);
			fail("Valoare salariu peste interval");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIntervalSalariuBun()
	{
		Angajati a1 = new Angajati("Daniel","CEO",10000,"0724890414");
		try {
			a1.setSalariu(7500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testIntervalSalariuLimita()
	{
		Angajati a1 = new Angajati("Daniel","CEO",10000,"0724890414");
		try {
			a1.setSalariu(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
