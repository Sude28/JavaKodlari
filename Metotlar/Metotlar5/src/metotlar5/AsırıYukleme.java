package metotlar5;

public class AsýrýYukleme {

	public static void main(String[] args) {
		System.out.println("3 ve 4 arasindaki maksimum " + max(3,4));
		
		System.out.println("3 ve 5.4 arasindaki maksimum " + max(3,5.4));
		
		System.out.println("3, 5.4 ve 10.14 arasindaki maksimum " + max(3,5.4,10.14));
	}
	
	public static int max(int sayi1,int sayi2) {
		if(sayi1>sayi2)
			return sayi1;
		else 
			return sayi2;
	}
	
	public static double max(double sayi1,double sayi2) {
		if(sayi1>sayi2)
			return sayi1;
		else 
			return sayi2;	
	}
	
	public static double max(double sayi1, double sayi2, double sayi3) {
		return max(max(sayi1,sayi2),sayi3);
	}

}
