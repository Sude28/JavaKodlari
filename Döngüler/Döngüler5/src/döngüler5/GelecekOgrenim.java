package döngüler5;

public class GelecekOgrenim {

	public static void main(String[] args) {
		double harc = 10000;
		int yýl = 1;
		while(harc < 20000) {
			harc = harc * 1.07;
			yýl++;
		}
		
		System.out.println("Egitim " + yýl + " yil sonra ikiye katlanacak");
		
		
	}

}
