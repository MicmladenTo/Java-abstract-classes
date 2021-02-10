package domaci_15Januar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Trener wenger = new Trener("Arsene", "Wenger", 1511950789456l, 1950, 30, "glavni trener");
		wenger.stampaj();
		
		System.out.println("----------------");
		
		Trener primorac = new Trener("Boro", "Primorac", 12648941564948l, 1951, 26, "pomocni trener");
		primorac.stampaj();
		
		System.out.println("////////////////");
		
		Igrac delPiero = new Igrac("Alesandro", "Del Piero", 641696545494l, 1974, 10, "polušpic", true);
		delPiero.stampaj();
		
		System.out.println("----------------");
		
		Igrac nedved = new Igrac("Pavel", "Nedved", 1619162191651l, 1972, 14, "desno krilo", false);
		nedved.stampaj();
	}

}
