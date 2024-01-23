package döngüler6;

public class Break {

	public static void main(String[] args) {
		int toplam = 0;
		int sayi = 0;
		
		while(sayi <20) {
			sayi++;
			toplam += sayi;
			if(toplam >= 100) break;
		}
		
		System.out.println("Sayi : "+ sayi);
		System.out.println("Toplam : "+ toplam);
		

	}

}
