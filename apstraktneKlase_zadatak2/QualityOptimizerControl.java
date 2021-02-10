package apstraktneKlase_zadatak2;

public class QualityOptimizerControl extends Control {
	
	private double brzinaInterneta;

	@Override
	public void izvrsiAkciju() {
		
		if brzinaInterneta * 10.1;
		
	}
	
	
}
//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
//•	ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//•	gettere, settere i konstruktore
//•	implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
