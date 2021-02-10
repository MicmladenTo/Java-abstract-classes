package apstraktneKlase_zadatak2;

public class VideoPlayer {
	public static double duzinaVidea;
	public static double trenutnoVremeVidea;
	public static double jacinaZvuka;
	private int[] kvalitetVidea = {144, 240, 360, 480, 720, 1080};
	
	public double getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public double getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}
	public double getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(double jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int[] getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int[] kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, double jacinaZvuka, int[] kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampaj() {
		System.out.println("Trenutno vreme videa: " + trenutnoVremeVidea);
		System.out.println("Jaèina zvuka: " + jacinaZvuka);
		System.out.println("Kvalitet videa: " + kvalitetVidea);
	}
	
}
//Kreirati klasu VideoPlayer koja ima:
//•	duzinu videa 
//•	trenutno vreme videa
//•	jacinu zvuka
//•	Kvalitet videa (144, 240, 360, 480, 720, 1080)
//•	gettere, settere i konstruktore
//•	metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
