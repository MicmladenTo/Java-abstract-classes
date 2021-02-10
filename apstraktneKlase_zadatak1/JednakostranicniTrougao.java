package apstraktneKlase_zadatak1;

public class JednakostranicniTrougao extends Figura {
	
	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}

	@Override
	public double povrsina() {
		double povrsina = (a * a) * 1.73205 / 4;
		return povrsina;
	}

	@Override
	public double obim() {
		double obim = a + a + a;
		return obim;
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Površina je: " + povrsina());
		System.out.println("Obim je: " + obim());
	}
	
	
	
}
//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//•	stranicu a
//•	gettere/settere/konstruktore
//•	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//•	implementira metodu obim
