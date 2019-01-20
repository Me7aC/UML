import java.time.LocalDate;

public class Person {
	private long svnr;
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
	private String email;
	private Adresse wohnort;
	
	public  Person(long svnr, String vorname, String nachname, LocalDate geburtsdatum, String email, Adresse wohnort){
		this.svnr = svnr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.wohnort = wohnort;
	}
	
	public long getSvnr() {
		return svnr;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public String getEmail() {
		return email;
	}
	public Adresse getwohnort(){
		return wohnort;
	}
}
