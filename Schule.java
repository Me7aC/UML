
public class Schule {
		private String name;
		private long schulkennzahl;
		private String schultyp;
		private Lehrer direktor;
		private Schueler schulsprecher;
		private Adresse standort;
		private ArrayList<Mitarbeiter> personal;
		private ArrayList<Abteilung> abteilungen;
		
		
		public Schule (String name,long schulkennzahl, String schultyp){
			this.name = name;
			this.schulkennzahl = schulkennzahl;
			this.schultyp = schultyp;
			this.direktor=direktor;
		}
		
		
		
		
		public boolean addPersonal(NichtLehrpersonal personal){
				return true;
		}
		public void addAbteilung(){
			return true;
		}
		public boolean setDirektor(){
			return Direktor;
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

