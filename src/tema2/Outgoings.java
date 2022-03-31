package tema2;

public class Outgoings {
	private String nume;
	private String prenume;
	private boolean areMasca;
	private boolean esteVaccinat;
	private int oraIesirii;

	public Outgoings(String prenume, String nume, boolean areMasca, boolean esteVaccinat, int oraIesirii) {
		this.nume = nume;
		this.prenume = prenume;
		this.areMasca = areMasca;
		this.esteVaccinat = esteVaccinat;
		this.oraIesirii = oraIesirii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public boolean isAreMasca() {
		return areMasca;
	}

	public void setAreMasca(boolean areMasca) {
		this.areMasca = areMasca;
	}

	public boolean isEsteVaccinat() {
		return esteVaccinat;
	}

	public void setEsteVaccinat(boolean esteVaccinat) {
		this.esteVaccinat = esteVaccinat;
	}

	public int getOraIesirii() {
		return oraIesirii;
	}

	public void setOraIesirii(int oraIesirii) {
		this.oraIesirii = oraIesirii;
	}
}
