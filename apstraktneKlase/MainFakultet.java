package apstraktneKlase;

public class MainFakultet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//= new Osoba("Milovan", "Pocek", 12312312312313l);
		//String name = osoba1.getIme();
		//osoba1.setIme("Ana");
		//System.out.println(name);
		//name = osoba1.getIme();
		//System.out.println(name);
		
		Osoba osoba1 = new Student("Paja", "Jovanovic", 123123123132l, "p22", 2);
		Osoba osoba2 = new Student("Pajac", "Jovanovic1", 123123123132l, "p23", 2);
		Osoba osoba3 = new Student("Marko", "Knezevic", 123123123132l, "p24", 2);
		//osoba1.stampaj();
		
		Student student1 = new Student("Tamara", "Petrovic", 123123123l, "p21", 4);
		//student1.stampaj();
		Osoba profesor1 = new Profesor("Milos", "Obilic", 231481234832498l, "istorija");
		Osoba profesor2 = new Profesor("Kosta", "Josifidis", 231481234832498l, "makroekonomiju");
		//profesor1.stampaj();
		
		Osoba[] nizOsoba1 = {osoba1, osoba2, osoba3};
		
		Osoba[] nizOsoba = new Osoba[5];
		nizOsoba[0] = osoba1;
		nizOsoba[1] = profesor1;
		nizOsoba[2] = osoba2;
		nizOsoba[3] = osoba3;
		nizOsoba[4] = student1;
		
		for (int i = 0; i < nizOsoba.length; i++) {
			nizOsoba[i].stampaj();
		}
		
		

	}

}
