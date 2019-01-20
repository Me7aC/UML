import java.util.ArrayList;
import java.util.Set;

public class Schule {
		private String name;
		private long schulkennzahl;
		private String schultyp;
		private Lehrer direktor;
		private Schueler schulsprecher;
		private Adresse standort;
		private ArrayList<NichtLehrpersonal> personal;
		private ArrayList<Abteilung> abteilungen;
		
		
		public Schule (String name,long schulkennzahl, String schultyp, Adresse standort){
			this.name = name;
			this.schulkennzahl = schulkennzahl;
			this.schultyp = schultyp;
			this.direktor=direktor;
			this.standort=standort;
			personal = new ArrayList<>();
			abteilungen = new ArrayList<>();
		}
		
		
		public boolean addPersonal(NichtLehrpersonal personal){
				return this.personal.add(personal);
		}
		public boolean addAbteilung(){
			return abteilungen.add(new Abteilung(name, kuerzel,this));
		}
		
		public boolean setDirektor(){
			direktor =  lehrer;
			return true;
		}
		public long getSchulkennzahl(){
			return schulkennzahl;
		}
		public String getName(){
			return name;
		}
	    public String getSchultyp() {
	        return schultyp;
	    }
	    public ArrayList<Mitarbeiter> getPersonal(){
	    	return personal;
	    }
	    public ArrayList<Schueler> getSchueler(){
	    	return schueler;
	    }
	    public int getAnzahlSchueler(){
	    	return anzahlSchueler;
	    }
}

