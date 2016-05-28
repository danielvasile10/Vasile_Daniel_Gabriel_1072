package clase;

import java.util.ArrayList;
import java.util.List;

public class Angajati {
	public String nume;
	public String departament;
	public int salariu;
	public String nrTelefon;
	public List<Angajati> listSubordonati;
	
	public Angajati(){}
	
	public Angajati(String nume,String departament,int salariu,String nrTelefon)
	{
		this.nume=nume;
		this.departament=departament;
		this.salariu=salariu;
		this.nrTelefon=nrTelefon;
		this.listSubordonati=new ArrayList<Angajati>();
	}
	
	public void addAngajat(Angajati a)
	{
		listSubordonati.add(a);
	}
	
	public void removeAngajat(Angajati a)
	{
		listSubordonati.remove(a);
	}
	
	public List<Angajati> getSubordonati()
	{
		return listSubordonati;
	}
	
	

	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", departament=" + departament + ", salariu=" + salariu + ", nrTelefon="
				+ nrTelefon + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) throws Exception{
		if(salariu < 0)
		{
			 throw new Exception("Valoarea salariului nu poate fi negativa!");
		}
		else if(salariu >=2000 && salariu <= 15000)
		{
			this.salariu = salariu;
		}
		else
		{
			throw new Exception("Salariu trebuie sa fie cuprins intre 2000 si 15000");
		}
		
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
	
	public int calculeazaSalariuAnual(Angajati a)
	{
		int salariuAnual = 0; 
		salariuAnual=a.getSalariu()*12;
		return salariuAnual;
	}
	
	public int calculeazaBonus(Angajati a)
	{
		int bonus=0;
		if(a.getSalariu()<5000)
		{
			bonus=500;
		}
		else
		{
			bonus = 200;
		}
		return bonus;
	}
	
	public boolean primaLiteraMare(Angajati a)
	{
		String nume=a.getNume();
		if(Character.isUpperCase(nume.charAt(0)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
