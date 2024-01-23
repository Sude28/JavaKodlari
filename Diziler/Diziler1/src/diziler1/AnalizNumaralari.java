package diziler1;

import java.util.Scanner;

public class AnalizNumaralari {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Oge sayisini giriniz: ");
		int n = input.nextInt();
		double[] sayilar = new double[n];
		double toplam = 0;
		
		System.out.print("Sayýlari gir: ");
		for(int i = 0; i < n; i++) {
			sayilar[i] = input.nextDouble();
			toplam += sayilar[i];
		}
		
		double ortalama = toplam / n ;
		
		int uzerinde = 0; // Ortalamanin ustundeki element sayilari
		for(int i = 0; i < n; i++) 
			if(sayilar[i] > ortalama)
				uzerinde++;
		
		System.out.println("Ortalama " + ortalama );
		System.out.println("Ortalamanin ustundeki eleman sayisi " + uzerinde);
			
	}

}

