package clase;

import interfete.ModPlata;

public class Cash implements ModPlata{

	@Override
	public void plataComanda(float total) {
		System.out.println("Total comanda : "+total + "platit cash .");
		
	}

}
