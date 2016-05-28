package clase;

public class Nestea extends Bauturi{

	public String nume;
	public String dimensiune;
	public float pret;
	@Override
	public String nume() {
		return "Nestea";
	}

	@Override
	public String dimensiune() {
		return "medie";
	}

	@Override
	public float pret() {
		return 5;
	}
	
	public Nestea(){}
	
	public Nestea(String nume,String dimensiune,float pret)
	{
		this.nume=nume;
		this.dimensiune=dimensiune;
		this.pret=pret;
	}

}
