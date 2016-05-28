package clase;

public class Restaurant {
	private static Restaurant restaurant = null;
	
	private Restaurant() throws Exception{
		if(restaurant != null)
		{
			throw new Exception("Instanta restaurant existenta");
		}
	}
	
	public static synchronized Restaurant getRestaurant() throws Exception{
		if(restaurant == null)
		{
			restaurant = new Restaurant();
		}
		return restaurant;
	}
	
	public Meniu creazaMeniu(String tipMeniu,String continut,int nrOptiuni){
		if(tipMeniu.equals("pranz")){
			return new MeniuPranz(continut, nrOptiuni);
		}
		else if(tipMeniu.equals("basic")){
			return new MeniuBasic(continut,nrOptiuni);
		}
		return null;
	}
	
	public Comanda comanda1(){
		Comanda comanda = new Comanda();
		comanda.adaugaObiecte(new SalataPui());
		comanda.adaugaObiecte(new Pepsi());
		return comanda;
	}
	
	public Comanda comanda2(){
		Comanda comanda = new Comanda();
		comanda.adaugaObiecte(new SalataSimpla());
		comanda.adaugaObiecte(new Nestea());
		return comanda;
	}
	
	public Comanda comanda3(){
		Comanda comanda = new Comanda();
		SalataPui sp = new SalataPui();
		SalataExotica salataExotica = new SalataExotica(sp);
		comanda.adaugaObiecte(salataExotica);
		comanda.adaugaObiecte(new Pepsi());
		return comanda;
	}
}
