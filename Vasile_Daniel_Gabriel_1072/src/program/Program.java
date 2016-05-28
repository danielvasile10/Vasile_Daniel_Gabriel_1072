package program;

import java.util.Scanner;

import clase.Abonati;
import clase.Angajati;
import clase.Card;
import clase.Cash;
import clase.Comanda;
import clase.Meniu;
import clase.MeniuBasic;
import clase.MeniuPranz;
import clase.Produs;
import clase.Restaurant;
import interfete.ModPlata;

public class Program {


	public static void main(String[] args) throws Exception
	{
		System.out.println("Test unicitate restaurant");
		Restaurant restaurant=Restaurant.getRestaurant();
		Restaurant restaurant1=Restaurant.getRestaurant();
		
		if(restaurant==restaurant1)
		{
			System.out.println("Instante identice");
		}
		else
		{
			System.out.println("Instantele nu sunt identice");
		}
		
		MeniuBasic mBasic=(MeniuBasic)restaurant.creazaMeniu("basic", "meniu basic", 50);
		System.out.println(mBasic.returneazaMeniu());
		
		MeniuPranz mPranz=(MeniuPranz)restaurant.creazaMeniu("pranz","meniu pranz", 10);
		System.out.println(mPranz.returneazaMeniu());
		
		Comanda comanda1 = restaurant.comanda1();
		System.out.println("Comanda 1 ");
		comanda1.printObiecte();
		System.out.println("Cost total : " + comanda1.costComanda());
		System.out.println("Cost total reducere aplicata : "+comanda1.aplicaReducere(0.10f));
		ModPlata Cash = new Cash();
		comanda1.plataComanda(Cash);
		
		Comanda comanda2 = restaurant.comanda2();
		System.out.println("Comanda 2 ");
		comanda2.printObiecte();
		System.out.println("Cost total : " + comanda2.costComanda());
		System.out.println("Cost total reducere aplicata : "+comanda2.aplicaReducere(0.20f));
		ModPlata Card = new Card();
		comanda2.plataComanda(Card);
		
		Comanda comanda3 = restaurant.comanda3();
		System.out.println("Comanda 3 ");
		comanda3.printObiecte();
		System.out.println("Cost total : " + comanda3.costComanda());
		System.out.println("Cost total reducere aplicata : "+comanda3.aplicaReducere(0.20f));
		ModPlata Card1 = new Card();
		comanda3.plataComanda(Card1);
		
		Angajati CEO = new Angajati("Daniel","CEO",10000,"0724890414");
		Angajati sefBucatarie = new Angajati("Marius","Bucatarie",3000,"0272354389");
		Angajati sefServire = new Angajati("Ioana","Servire",2000,"0725727845");
		CEO.addAngajat(sefBucatarie);
		CEO.addAngajat(sefServire);
		
		Angajati bucatar1 = new Angajati("Andrei","Bucatarie",1000,"0642869457");
		Angajati bucatar2 = new Angajati("Mirela","Bucatarie",1000,"0643849457");
		sefBucatarie.addAngajat(bucatar1);
		sefBucatarie.addAngajat(bucatar2);
		
		Angajati servire1 = new Angajati("Madalina","Servire",1000,"0643549457");
		Angajati servire2 = new Angajati("Mihai","Servire",1000,"06432349457");
		sefServire.addAngajat(servire1);
		sefServire.addAngajat(servire2);
		
		System.out.println(CEO);
		
		for (Angajati a : CEO.getSubordonati()) {
	         System.out.println(a);
	         
	         for (Angajati angajati : a.getSubordonati()) {
	            System.out.println(angajati);
	         }
	      }
		Abonati client1= new Abonati("Marius","0724890414","1940204060516");
		Abonati client2= new Abonati("Andreea","0724890414","2930204060516");
		int varstaclient1 = client1.extragereVarsta();
		String genclient1 = client1.extragereGen();
		
		int varstaclient2 = client2.extragereVarsta();
		String genclient2 = client2.extragereGen();
		
		System.out.println(varstaclient1);
		System.out.println(genclient1);
		System.out.println(varstaclient2);
		System.out.println(genclient2);
		
		Produs salate= new Produs("Salate","Reducerea nu e valabila");
		System.out.println("Categorie salate");
		salate.abonare(client1);
		salate.abonare(client2);
		
		salate.setPerioadaReducere("Reducere 10%");
		
		
		
		
		
		
		
	}
}
