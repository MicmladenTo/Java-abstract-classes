package apstraktneKlase_zadatak2;

public class AudioControl extends Control {

	private boolean utisajZvuk;
	private boolean pojacajZvuk;
	
	public AudioControl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsiAkciju() {
		// TODO Auto-generated method stub
		if (pojacajZvuk == true && VideoPlayer.jacinaZvuka < 100) {
			VideoPlayer.jacinaZvuka = VideoPlayer.jacinaZvuka + 1;
		} else if (pojacajZvuk == true && VideoPlayer.jacinaZvuka > 1) {
			VideoPlayer.jacinaZvuka = VideoPlayer.jacinaZvuka - 1;
		}
	}

}
//Kreirati klasu AudioControl koja nasledjuje klasu Control i 
//•	gettere, settere i konstruktore
//•	ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//•	implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
