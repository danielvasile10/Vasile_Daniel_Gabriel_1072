package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Abonati;

public class AbonatiTest {

	Abonati a = new Abonati();
	Abonati b = new Abonati();
	
	@Before
	public void setUp() throws Exception{
		a = new Abonati("Daniel","0724890414","1940204060516");
		b = new Abonati("Ioana","0724891423","2940202050216");
	}
	
	@Test
	public void calculVarstaCNP()
	{
		int varsta = a.extragereVarsta();
		assertEquals(22,varsta);
	}
	
	@Test
	public void extrageGenCNP()
	{
		String gen = b.extragereGen();
		assertEquals("F",gen);
	}
	
	@Test
	public void testCNP()
	{
		try {
			a.setCnp("1940302030017");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCNPSub() //dimensiune 12
	{
		try {
			a.setCnp("194030203017");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCNPPeste() //dimensiune 14
	{
		try {
			a.setCnp("19403020301723");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetName()
	{
		assertEquals("Daniel",a.getAbonatName());
	}
	
	@Test
	public void testSetName()
	{
		a.setAbonatName("NumeNou");
		assertEquals("NumeNou",a.getAbonatName());
	}
	
	@Test
	public void testGetNrTelefon()
	{
		assertEquals("0724890414",a.getNrTelefon());
	}
	
	@Test
	public void set9NrTelefon()  //10 sau 12 caractere
	{
		try {
			a.setNrTelefon("072489041"); //9 caractere
			fail("Metoda nu arunca exceptie pe un string de 9 caractere");
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	@Test
	public void se11NrTelefon()  //10 sau 12 caractere
	{
		try {
			a.setNrTelefon("07248904144"); //11 caractere
			fail("Metoda nu arunca exceptie pe un string de 11 caractere");
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	@Test
	public void set13NrTelefon()  //10 sau 12 caractere
	{
		try {
			a.setNrTelefon("0724890415231"); //13 caractere
			fail("Metoda nu arunca exceptie pe un string de 13 caractere");
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	@Test
	public void set10NrTelefon()  //10 sau 12 caractere
	{
		try {
			a.setNrTelefon("0724890414"); //10 caractere
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	@Test
	public void set12NrTelefon()  //10 sau 12 caractere
	{
		try {
			a.setNrTelefon("+40724890414"); //12 caractere
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
