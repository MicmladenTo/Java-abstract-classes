package apstraktneKlase;

public class Student extends Osoba {
	private String brIndexa;
	private int godinaStudija;
	
	public Student(String ime, String prezime, long jmbg, String brIndexa, int godinaStudija) {
		super(ime, prezime, jmbg);
		this.brIndexa = brIndexa;
		this.godinaStudija = godinaStudija;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	@Override
	public void stampaj() {
		System.out.println(getIme() + " " + getPrezime() + 
		"(" + getJmbg() + ") je stunent " + godinaStudija + ". godine studija sa brojem indexa " + brIndexa );
	}
	
	
}
