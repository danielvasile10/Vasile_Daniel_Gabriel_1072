package clase;

public class MeniuPranz extends Meniu{

	public MeniuPranz(String continut, int nrOptiuni) {
		super(continut, nrOptiuni);
	}

	@Override
	public String returneazaMeniu() {
		return "Meniu pranz : " + "continut - " + continut + " Numar optiuni : " + nrOptiuni + ".";
	}

}
