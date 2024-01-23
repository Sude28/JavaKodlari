package metotlar2;

public class VoidMetot {

	public static void main(String[] args) {
		System.out.print("Alýnan puan ");
		HarfBul(78.5);
		
		System.out.print("Alýnan puan ");
		HarfBul(59.5);
	}
	
	public static void HarfBul(double puan) {
		if (puan >= 90.0) {
			System.out.println('A');
		}
		else if (puan >= 80.0) {
			System.out.println('B');	
		}
		else if (puan >= 70.0) {
			System.out.println('C');	
		}
		else if (puan >=60.0) {
			System.out.println('D');	
		}
		else  {
			System.out.println('F');	
		}
	}
}
