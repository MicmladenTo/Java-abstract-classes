package apstraktneKlase_zadatak1;

public class Pravougaonik extends Figura {
	
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		double povrsina = a * b;
		return povrsina;
	}
	@Override
	public double obim() {
		// TODO Auto-generated method stub
		double obim = a + a + b + b;
		return obim;
	}
	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Povr�ina je: " + povrsina());
		System.out.println("Obim je: " + obim());
	}
	
	
	
	
	
}

//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//�	stranice a i b
//�	gettere/settere/konstruktore
//�	implementira metodu povrsina
//�	implementira metodu obim
