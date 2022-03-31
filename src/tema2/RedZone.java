package tema2;

public class RedZone extends Zone {

	public RedZone(String ID, String nume, int CenterX, int CenterY, int nrInfectati) {
		super(ID, nume, CenterX, CenterY, nrInfectati);
	}

	public boolean getOut(Outgoings outgoing) {
		if (!outgoing.isAreMasca())
			return false;
		if (outgoing.getOraIesirii() < 5 || outgoing.getOraIesirii() >= 22)
			return false;
		return true;
	}

}
