package clase;

public class SalataExotica extends SalataDecorator{

	public SalataExotica(Salata Salata) {
		super(Salata);
	}
	
	@Override
	public String nume() {
		return salata.nume() + " , speciala";
	}

	@Override
	public String dimensiune() {
		return salata.dimensiune();
	}

	@Override
	public float pret() {
		return salata.pret() + 5.0f;
	}

}
