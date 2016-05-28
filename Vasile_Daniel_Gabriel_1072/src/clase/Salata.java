package clase;

import interfete.ObiecteComanda;

public abstract class Salata implements ObiecteComanda{
	@Override
	public abstract String nume();
	
	@Override
	public abstract String dimensiune();
	
	@Override
	public abstract float pret();
}
