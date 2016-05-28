package clase;

public class SalataPui extends Salata{

	public String nume;
	public String dimensiune;
	public float pret;
	@Override
	public String nume() {
		return "Salata pui";
	}

	@Override
	public String dimensiune() {
		return "mare";
	}

	@Override
	public float pret() {
		return 25;
	}
	
	public SalataPui(){}
	
	public SalataPui(String nume,String dimensiune,float pret)
	{
		this.nume=nume;
		this.dimensiune=dimensiune;
		this.pret=pret;
	}

}
