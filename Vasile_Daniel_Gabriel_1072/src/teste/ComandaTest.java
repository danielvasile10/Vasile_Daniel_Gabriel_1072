package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clase.Bauturi;
import clase.Card;
import clase.Comanda;
import clase.Nestea;
import clase.Pepsi;
import clase.SalataPui;
import interfete.ModPlata;
import interfete.ObiecteComanda;

public class ComandaTest {
	ModPlata mod;
	Comanda c = new Comanda();
	private List<ObiecteComanda> obiecteComanda ;
	Pepsi p1 = new Pepsi("Pepsi","medie",5);
	Nestea n1 = new Nestea("Nestea","medie",5);
    SalataPui p = new SalataPui("Salata Pui","mare",25);
	
	@Before
	public void setUp() throws Exception {
		obiecteComanda = new ArrayList<ObiecteComanda>();
		c.adaugaObiecte(p1);
		c.adaugaObiecte(p);
	}
	
	@Test
	public void testAdaugareColectie()
	{
		assertEquals("dimensiune gresita", 2, c.obiecteComanda.size());
		Pepsi p2 = new Pepsi("Pepsi","mare",7);
		c.adaugaObiecte(p2);
	    assertEquals("dimensiune gresita", 3, c.obiecteComanda.size());
	    
	    assertEquals("obiect incorect", p1, c.obiecteComanda.get(0));
	    assertEquals("obiect incorect", p, c.obiecteComanda.get(1));
	    assertEquals("obiect incorect", p2, c.obiecteComanda.get(2));
	}
	
	@Test   
	public void testStergereObiecteColectie() 
	{
		assertEquals("dimensiune gresita", 2, c.obiecteComanda.size());
		c.stergeObiecte(p);
		assertEquals("dimensiune gresita , stergere nereusita", 1, c.obiecteComanda.size());
	}
	
	@Test
	public void testareCostComanda()
	{
		assertEquals(30,c.costComanda(),0.0f);
	}
	
	@Test
	public void testAplicaReducere10()
	{
		try {
			assertEquals(27,c.aplicaReducere(0.10f),0.0f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAplicaReducere20() throws Exception
	{
		assertEquals(24,c.aplicaReducere(0.20f),0.0f);
	}
	
	@Test
	public void testAplicaReducereSub10()
	{
		try {
			assertEquals(24,c.aplicaReducere(0.05f),0.0f);
			fail("Reducere incorecta , trebuia sa fie de 0.10 sau 0.20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAplicaReducereIntre()
	{
		try {
			assertEquals(25.5,c.aplicaReducere(0.15f),0.0f);
			fail("Reducere incorecta , trebuia sa fie de 0.10 sau 0.20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAplicaReducerePeste()
	{
		try {
			assertEquals(22.5,c.aplicaReducere(0.25f),0.0f);
			fail("Reducere incorecta , trebuia sa fie de 0.10 sau 0.20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testplataComanda() //cost <35 plata cash
	{
		try {
			c.plataComanda(mod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() throws Exception {
		obiecteComanda.clear();
	}
	
	@Test
	public void testColectieLibera2()
	{
		assertTrue(obiecteComanda.isEmpty());
	}
	
	@Test
	public void testplataComanda2() //cost >= 35 plata card
	{
		Comanda c2 = new Comanda();
		obiecteComanda = new ArrayList<ObiecteComanda>();
		c2.adaugaObiecte(p1);
		c2.adaugaObiecte(p);
		c2.adaugaObiecte(n1);
		try {
			c2.plataComanda(mod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testplataComanda3() //cost <= 0 exceptie
	{
		Comanda c3 = new Comanda();
		obiecteComanda = new ArrayList<ObiecteComanda>();
		try {
			c3.plataComanda(mod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
