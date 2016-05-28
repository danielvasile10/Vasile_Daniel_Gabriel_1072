package clase;

public abstract class SalataDecorator extends Salata{
	protected Salata salata;
	
	public SalataDecorator(Salata Salata){
		this.salata=Salata;
	}
	
	@Override
	public String nume() {
		return salata.nume();
	}

	@Override
	public String dimensiune() {
		return salata.dimensiune();
	}

	@Override
	public float pret() {
		return salata.pret();
	}
}
