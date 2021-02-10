package apstraktneKlase;

public abstract class Osoba {
	private String ime;
	private String prezime;
	private long jmbg;
	
	public Osoba(String ime, String prezime, long jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public long getJmbg() {
		return jmbg;
	}

	public void setJmbg(long jmbg) {
		this.jmbg = jmbg;
	}
	
	public abstract void stampaj();
	
	
}
