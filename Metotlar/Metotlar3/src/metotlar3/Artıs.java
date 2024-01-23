package metotlar3;

public class Artýs {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Metodu cagirmadan once " + x);
		Artis(x);
		System.out.println("Metodu cagirdiktan sonra " + x);  //Pass-by-value: Sadece deger degisiyor. Adrese gore degisitrme olmadigindan fonksiyondan sonra yine ayni deger cikiyor.
	}
	
	public static void Artis (int n ) {
		n++;
		System.out.println("Metodun icinde " + n);

	}

}
