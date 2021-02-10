package domaci_14Januar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor justejnGorder = new Autor("Justejn", "Gorder");
		Autor umbertoEko = new Autor("Umberto", "Eko");
		
		
		Knjiga sofijinSvet = new Knjiga(897442643521049l, "Sofijin svet", 1991, justejnGorder);
		Knjiga misterijaPasijansa = new Knjiga(7894654987495664l, "Misterija pasijansa", 1993, justejnGorder);
		Knjiga devojkaSaPomorandzama = new Knjiga(23198456498495l, "Devojka sa pomorandžama", 1989, "Justejn", "Gorder");
		
		Knjiga fukoovoKlatno = new Knjiga(98765489846545l, "Fukoovo klatno", 1988, "Umberto", "Eko");
		Knjiga ostrvoDanaPredjasnjeg = new Knjiga(89156498416651l, "Ostrvo dana preðašnjeg", 1979, umbertoEko);
		Knjiga imeRuze = new Knjiga(78941456465132156l, "Ime ruže", 1975, umbertoEko);
		
		
		sofijinSvet.print();
		System.out.println("-------------------");
		devojkaSaPomorandzama.print();
		System.out.println("-------------------");
		misterijaPasijansa.print();
		System.out.println("-------------------");
		ostrvoDanaPredjasnjeg.print();
		System.out.println("-------------------");
		imeRuze.print();
		System.out.println("-------------------");
		fukoovoKlatno.print();
	}

}
//U glavnom programu napraviti vise autora sa vise knjiga.