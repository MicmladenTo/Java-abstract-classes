package domaci_14Januar;

public class Knjiga {
	
	private long ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public long getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Knjiga(long iSBN, String naziv, int godinaIzdanja, Autor autor) {
		super();
		ISBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}
	
	public Knjiga(long iSBN, String naziv, int godinaIzdanja, String ime, String prezime) {
		super();
		ISBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = new Autor(ime, prezime);
	}

	public void print() {
		System.out.println("(" + ISBN + ")");
		System.out.println("(" + naziv + ")" + "(" + godinaIzdanja + ")");
		System.out.println("Autor: "); getAutor().stampaj();
	}
	
}
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
