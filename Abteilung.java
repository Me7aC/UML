import java.util.ArrayList;

public class Abteilung {
	private String kuerzel;
	private String name;
	private ArrayList<Schueler> schueler;
	
	public String getName(){
		return name;
	}
	public String getKuerzel(){
		return kuerzel;
	}
	public ArrayList<Schueler> getSchueler(){
		return schueler;
	}
	public boolean addLehrer(Lehrer I){
		return true;
	}
}
