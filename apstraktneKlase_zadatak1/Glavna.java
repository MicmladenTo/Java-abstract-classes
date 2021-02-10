package apstraktneKlase_zadatak1;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura trougao1 = new JednakostranicniTrougao(4);
		Figura trougao2 = new JednakostranicniTrougao(5);
		
		Figura pravouganik1 = new Pravougaonik(3, 4);
		Figura pravouganik2 = new Pravougaonik(2, 5);
		Figura pravouganik3 = new Pravougaonik(2, 5);
		
		Figura [] nizFigura = {trougao1, trougao2, pravouganik1, pravouganik2, pravouganik3};
		
		double zbirPovrsina = 0;
		double zbirObima = 0;
		
		for (int i = 0; i < nizFigura.length; i++) {
			nizFigura[i].stampaj();
			
			System.out.println("////////////////");
			
			zbirPovrsina = zbirPovrsina + nizFigura[i].povrsina();
			zbirObima = zbirObima + nizFigura[i].obim();
		}
			System.out.println("Zbir površina je: " + zbirPovrsina);
			System.out.println("Zbir površina je: " + zbirObima);
	}
}


// zbir povrsina i zbir obima!
