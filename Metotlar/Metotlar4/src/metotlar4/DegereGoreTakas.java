package metotlar4;

public class DegereGoreTakas {

	public static void main(String[] args) {
		int sayi1 = 1;
		int sayi2 = 2;
		
		System.out.println("Takas yontemini cagirmadan once sayi1: " + sayi1 + " ve sayi2: " + sayi2);
		
		Takas(sayi1,sayi2);
		
		System.out.println("Takas yontemini cagirdiktan sonra sayi1: " + sayi1 + " ve sayi2: " + sayi2);

	}
	
	public static void Takas(int s1, int s2) {
		System.out.println("Takas yonteminin icinde");
		System.out.println("\t Takas yonteminden once sayi1: " + s1 + " ve sayi2: " + s2 );
		
		int gecici = s1;
		s1 = s2;
		s2 = gecici;
		
		System.out.println("\t Takas yonteminden sonra sayi1: " + s1 + " ve sayi2: " + s2 );  

	}
}
