package döngüler7;

public class Continue {

	public static void main(String[] args) {
		int toplam = 0;
		int sayi = 0;
		
		while(sayi < 20) {
			sayi++;
			if(sayi == 10 || sayi == 11) 
				continue;
			toplam += sayi;
		}
		
		System.out.println("Toplam: " + toplam);
		
		

	}

}
