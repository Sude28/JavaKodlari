package d�ng�ler5;

public class GelecekOgrenim {

	public static void main(String[] args) {
		double harc = 10000;
		int y�l = 1;
		while(harc < 20000) {
			harc = harc * 1.07;
			y�l++;
		}
		
		System.out.println("Egitim " + y�l + " yil sonra ikiye katlanacak");
		
		
	}

}
