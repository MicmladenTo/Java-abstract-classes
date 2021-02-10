package domaci_15Januar;

public class Igrac extends Osoba {
	
	private int brojNaDresu;
	private String pozicija;
	private boolean kapiten;
	
	//getteri i setteri za broj, kapiten i poziciju
	public int getBrojNaDresu() {
		return brojNaDresu;
	}
	public void setBrojNaDresu(int brojNaDresu) {
		this.brojNaDresu = brojNaDresu;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	// kapitenstvo
	public String kapitenstvo() {
		if(kapiten == true) {
			return "kapiten tima je.";
		} else {
			return "nije kapiten.";
		}
	}
	
	// defaultni konstruktor
	public Igrac(String ime, String prezime, long jmbg, int godinaRodjenja) {
		super(ime, prezime, jmbg, godinaRodjenja);
		// TODO Auto-generated constructor stub
	}
	
	//konstruktor sa parametrima

	public Igrac(String ime, String prezime, long jmbg, int godinaRodjenja, int brojNaDresu, String pozicija,
			boolean kapiten) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.brojNaDresu = brojNaDresu;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}
	

	public void stampaj() {
		super.stampaj();
		System.out.println("Broj na dresu igraèa je: " + brojNaDresu + ", pozicija mu je " + pozicija + 
				" i " + kapitenstvo());
		}
	}
		

	

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
