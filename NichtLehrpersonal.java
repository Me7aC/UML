import java.time.LocalDate;

public class NichtLehrpersonal extends Mitarbeiter{
	
	public NichtLehrpersonal(long svnr, String vorname, String nachname, LocalDate geburtsdatum, String email)
	{
		super(svnr, vorname, nachname, geburtsdatum, email);
	}

}
