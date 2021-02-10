package domaci_15Januar;

public class Trener extends Osoba {
	
	private int godineIskustva;
	private String tipTrenera;
	
	
	// Getteri i setteri
	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera(String tipTrenera) {
		switch(tipTrenera) {
		case "kondicioni": {
			return "kondicioni trener";
		}
		case "za igru": {
			return "trener za igru";
		}
		case "pomocni": {
			return "pomocni trener";
		}
		case "personalni": {
			return "personalni trener";
		}
		case "glavni trener": {
			return "glavni trener";
		}
		default: return "trener";
		}
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
		



	// konstruktor
	public Trener(String ime, String prezime, long jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}


	public void stampaj() {
		super.stampaj();
		System.out.println("Ovaj " + tipTrenera + " ima " + godineIskustva + " godina iskustva.");
	}


}
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.