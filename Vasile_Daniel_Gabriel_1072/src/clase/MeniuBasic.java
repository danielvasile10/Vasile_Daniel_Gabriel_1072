package clase;

public class MeniuBasic extends Meniu{

	public MeniuBasic(String continut, int nrOptiuni) {
		super(continut, nrOptiuni);
	}

	@Override
	public String returneazaMeniu() {
		return "Meniu basic : " + "continut - " + continut + " Numar optiuni : " + nrOptiuni + ".";
	}

}
