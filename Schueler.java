import java.time.LocalDate;
import java.time.Period;

public class Schueler extends Person {
	private int katalognummer;
	private boolean eigenberechtigt;
	private LocalDate eintrittsdatum;
	
	public int getKatalognummer() {
		return katalognummer;
	}
	public boolean isEigenberechtigt() {
		return eigenberechtigt;
	}
	public LocalDate getEintrittsdatum() {
		return eintrittsdatum;
	}
}
