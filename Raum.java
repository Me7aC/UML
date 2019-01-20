
public class Raum {
	private String raumNummer;
	private int maxSitzplaetze;
	private Raumtyp raumtyp;
	
	public Raum(String raumN, int maxSitzp, Raumtyp raumt){
		raumNummer = raumN;
		maxSitzplaetze = maxSitzp;
		raumtyp = raumt;
	}
	public String getRaumnummer(){
		return raumNummer;
	}
	public int getMaxSitzplaetze(){
		return maxSitzplaetze;
	}
	public Raumtyp getRaumtyp(){
		return raumtyp;
	}
}

enum Raumtyp {
	KLASSENZIMMER, LABORRAUM
}
