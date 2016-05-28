package clase;

import interfete.ModPlata;

public class Card implements ModPlata{

	@Override
	public void plataComanda(float total) {
		System.out.println("Total comanda : "+total + "platit card .");
		
	}

}
