package objelervesýnýflar7;

public class Kredi {
	private double  yillikfaizorani;
	private int yilsayisi;
	private double kreditutari;
	private java.util.Date kreditarihi;
	
	public Kredi() {
		this(2.5, 1, 1000); //Constructorun bir diger gorevi boþ constructorden parametreli constructoru cagirmak
	}
	
	public Kredi(double yillikfaizorani, int yilsayisi, double kreditutari) {
		this.yillikfaizorani = yillikfaizorani;
		this.yilsayisi = yilsayisi;
		this.kreditutari = kreditutari;
		kreditarihi = new java.util.Date();	
	}
	
	public double getyillikfaizorani() {
		return yillikfaizorani;
	}
	
	public void setyillikfaizorani(double yillikfaizorani) {
		this.yillikfaizorani = yillikfaizorani;
	}
	
	public int getyilsayisi() {
		return yilsayisi;
	}
	
	public void setyilsayisi(int yilsayisi) {
		this.yilsayisi = yilsayisi;
	}
	
	public double getkreditutari() {
		return kreditutari;
	}
	
	public void setkreditutari(double kreditutari) {
		this.kreditutari = kreditutari;
	}
	
	public double getaylikodeme() {    //aylik odenecek tutari bulma
		double aylikfaizorani = yillikfaizorani / 1200;
		double aylikodeme = kreditutari * aylikfaizorani / (1 - (1 / Math.pow(1 + aylikfaizorani , yilsayisi *12)));
		return aylikodeme;
	}
	
	public double gettoplamodeme() {
		double toplamodeme = getaylikodeme() * yilsayisi *12;
		return toplamodeme;
	}
	
	public java.util.Date getkreditarihi() {
		return kreditarihi;
	}

}
