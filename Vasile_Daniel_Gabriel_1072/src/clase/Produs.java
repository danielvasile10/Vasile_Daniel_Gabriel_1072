package clase;

import java.util.ArrayList;

import interfete.Observer;
import interfete.Subiect;

public class Produs implements Subiect{
	public ArrayList<Observer> observatori = new ArrayList<Observer>();
	public String categorie;
	public String perioadaReducere;
	
	public Produs(String categorie,String perioadaReducere)
	{
		this.categorie=categorie;
		this.perioadaReducere=perioadaReducere;
	}
	
	public ArrayList<Observer> getObservatori() {
		return observatori;
	}

	public void setObservatori(ArrayList<Observer> observatori) {
		this.observatori = observatori;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getPerioadaReducere() {
		return perioadaReducere;
	}

	public void setPerioadaReducere(String perioadaReducere) {
		this.perioadaReducere = perioadaReducere;
		notifica();
	}

	@Override
	public void abonare(Observer obs) {
		if(obs!=null && !(observatori.contains(obs)))
		{
			observatori.add(obs);
		}
		
	}

	@Override
	public void dezabonare(Observer obs) {
		observatori.remove(obs);
		
	}

	@Override
	public void notifica() {
		System.out.println("Notifica toti abonatii cand periaoda de reducere este activata");
		 for (Observer o : observatori) {
            o.update(this.perioadaReducere );
	}
	
}
	
}
