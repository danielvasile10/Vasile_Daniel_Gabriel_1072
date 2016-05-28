package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.ModPlata;
import interfete.ObiecteComanda;

public class Comanda {
	public List<ObiecteComanda> obiecteComanda = new ArrayList<ObiecteComanda>();
	
	public void adaugaObiecte(ObiecteComanda obiect){
		obiecteComanda.add(obiect);
	}
	
	public void stergeObiecte(ObiecteComanda obiect)
	{
		obiecteComanda.remove(obiect);
	}
	
	public float costComanda(){
		float cost=0;
		
		for(ObiecteComanda obiect : obiecteComanda){
			cost = cost + obiect.pret();
		}
		return cost;
	}
	
	public float aplicaReducere(float reducere) throws Exception
	{
		float cost=0;
		for(ObiecteComanda obiect : obiecteComanda){
			cost = cost + obiect.pret();
		}
		if(reducere == 0.10f)
		{
			return cost - (cost*reducere);
		}
		else if(reducere == 0.20f)
		{
			return cost - (cost*reducere);
		}
		else 
		{
			throw new Exception ("Reducere incorecta.");
		}
	}
	
	public void printObiecte(){
		for(ObiecteComanda obiect : obiecteComanda){
			System.out.println("Obiect : "+obiect.nume());
			System.out.println("Dimensiune : "+obiect.dimensiune());
			System.out.println("Pret : "+obiect.pret());
		}
	}
	
	public void plataComanda(ModPlata mod) throws Exception
	{
		if(costComanda() <= 0)
		{
			throw new Exception ("Cost comanda 0 sau negativ");
		}
		else if (costComanda() < 35)
		{
			Cash platacash = new Cash();
			platacash.plataComanda(costComanda());
		}
		else if (costComanda() >= 35 )
		{
			Card platacard = new Card();
			platacard.plataComanda(costComanda());
		}
		
		
	}
}
