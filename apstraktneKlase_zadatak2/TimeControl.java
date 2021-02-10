package apstraktneKlase_zadatak2;

public class TimeControl extends Control{

	private boolean pomeriTrenutnoVreme;
	private double trenutnoVreme;
		

	@Override
	public void izvrsiAkciju() {
		// TODO Auto-generated method stub
		if (pomeriTrenutnoVreme == true && VideoPlayer.duzinaVidea > VideoPlayer.trenutnoVremeVidea + 15) {
				VideoPlayer.trenutnoVremeVidea = trenutnoVreme + 15;
		} else {
			VideoPlayer.trenutnoVremeVidea = trenutnoVreme - 15;
		}
	}
}
//Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore
//•	ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//•	implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad
//	u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

