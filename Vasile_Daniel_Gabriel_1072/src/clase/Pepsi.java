package clase;

public class Pepsi extends Bauturi{

	public String nume;
	public String dimensiune;
	public float pret;
	@Override
	public String nume() {
		return "Pepsi";
	}

	@Override
	public String dimensiune() {
		return "medie";
	}

	@Override
	public float pret() {
		return 5;
	}
	public Pepsi(){}
	
	public Pepsi(String nume,String dimensiune,float pret)
	{
		this.nume=nume;
		this.dimensiune=dimensiune;
		this.pret=pret;
	}

}
