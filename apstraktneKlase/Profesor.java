package apstraktneKlase;

public class Profesor extends Osoba {
	private String predmet;

	public Profesor(String ime, String prezime, long jmbg, String predmet) {
		super(ime, prezime, jmbg);
		this.predmet = predmet;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	@Override
	public void stampaj() {
		System.out.println(getIme() + " " + getPrezime() + "(" + getJmbg() + ") je profesor na predmetu " + predmet);
	}

}
