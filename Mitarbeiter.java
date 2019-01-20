import java.time.LocalDate;

public class Mitarbeiter extends Person {
	private static int anzahl = 0;
	
	public Mitarbeiter(long svnr, String vorname, String nachname, LocalDate geburtsdatum, String email){
		
		super(svnr, vorname, nachname, geburtsdatum, email);
		anzahl++;
	}
	
	public int getAnzahl(){
		return anzahl;
	}
}
