
public class Klasse {
	private String bezeichnung;
	private int schulstufe;
	private float durchschnittsalter;
	private Schueler klassensprecher;
	
	public String getBezeichnung(){
		return bezeichnung;
	}
	public int getSchulstufe(){
		return schulstufe;
	}
	public float getDurchschnittsalter(){
		return durchschnittsalter;
	}
	public boolean setKlassensprecher(Schueler schueler){
		klassensprecher = schueler;
		return true;
	}
	public boolean addSchueler(Schueler schueler){
		return schueler;
	}
	public void exportStundenplan(){
		return stundenplan;
	}
}
