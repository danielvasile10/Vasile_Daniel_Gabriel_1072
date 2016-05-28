package clase;

import java.util.Calendar;

import interfete.Observer;

public class Abonati implements Observer{

	public String abonatName;
	public String nrTelefon;
	public String cnp;
	
	public Abonati()
	{
		
	}
	
	public Abonati(String abonatName,String nrTelefon,String cnp) throws Exception
	{
		this.abonatName=abonatName;
		if(nrTelefon.length() == 10 || nrTelefon.length() == 12)
		{
			this.nrTelefon=nrTelefon;
		}
		else
		{
			throw new Exception ("Numarul de telefon trebuie sa fie format din 10 sau 12 caractere");
		}
		this.cnp=cnp;
		
	}
	public String getAbonatName() {
		return abonatName;
	}
	public void setAbonatName(String abonatName) {
		this.abonatName = abonatName;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) throws Exception{
		if(nrTelefon.length() == 10 || nrTelefon.length() == 12)
		{
			this.nrTelefon=nrTelefon;
		}
		else
		{
			throw new Exception ("Numarul de telefon trebuie sa fie format din 10 sau 12 caractere");
		}
	}
	
	
	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) throws Exception {
		if(cnp.length() == 13)
		{
			this.cnp = cnp;
		}
		else
		{
			throw new Exception("CNP ul are 13 caractere");
		}
		
	}
	
	public int extragereVarsta(){
		return 2016 - (1900 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
	}
	
	public String extragereGen(){
		switch(cnp.charAt(0))
		{
			case '1': return "M";
			case '2': return "F";
		}
		return null;
	}
	

	@Override
	public void update(String perioadaReducere) {
		System.out.println("Buna ziua "+ abonatName + ", este activa o reducere de 10%");
		
	}
	
	
}
