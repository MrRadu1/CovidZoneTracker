package tema2;

public class GreenZone extends Zone {

	public GreenZone(String ID, String nume, int CenterX, int CenterY, int nrInfectati) {
		super(ID, nume, CenterX, CenterY, nrInfectati);
	}

	public boolean getOut(Outgoings outgoing) {
		if (outgoing.isEsteVaccinat())
			return true;
		if (outgoing.isAreMasca())
			return true;
		return false;

	}
}