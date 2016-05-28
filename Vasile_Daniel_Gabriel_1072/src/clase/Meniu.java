package clase;

public abstract class Meniu {
	String continut;
	int nrOptiuni;
	
	public Meniu(String continut,int nrOptiuni)
	{
		this.continut = continut;
		this.nrOptiuni = nrOptiuni;
	}
	
	public abstract String returneazaMeniu();
	
}
