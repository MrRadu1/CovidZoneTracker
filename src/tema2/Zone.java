package tema2;

public abstract class Zone {
	private String ID;
	private String nume;
	private int CenterX;
	private int CenterY;
	private int nrInfectati;

	public Zone(String ID, String nume, int CenterX, int CenterY, int nrInfectati) {
		this.CenterX = CenterX;
		this.CenterY = CenterY;
		this.ID = ID;
		this.nrInfectati = nrInfectati;
		this.nume = nume;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCenterX() {
		return CenterX;
	}

	public void setCenterX(int centerX) {
		CenterX = centerX;
	}

	public int getCenterY() {
		return CenterY;
	}

	public void setCenterY(int centerY) {
		CenterY = centerY;
	}

	public int getNrInfectati() {
		return nrInfectati;
	}

	public void setNrInfectati(int nrInfectati) {
		this.nrInfectati = nrInfectati;
	}

	public abstract boolean getOut(Outgoings outgoing);
}
