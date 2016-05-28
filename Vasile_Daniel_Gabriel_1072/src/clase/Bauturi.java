package clase;

import interfete.ObiecteComanda;

public abstract class Bauturi implements ObiecteComanda{
	@Override
	public abstract String dimensiune();
	
	@Override
	public abstract float pret();
}
