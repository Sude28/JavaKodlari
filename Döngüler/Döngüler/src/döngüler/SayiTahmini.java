package d�ng�ler;

import java.util.Scanner;

public class SayiTahmini {
	public static void main(String[] args) {
		int bilgisayar = (int) (Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		
		int tahmin = -1;
		
		while(tahmin != bilgisayar) {
			System.out.println("L�tfen 1 ile 100 arasinda bir sayi giriniz");
		    tahmin = input.nextInt();
			
			if(tahmin == bilgisayar)
				System.out.println("Dogru tahmin , sayi:"+ bilgisayar);
			else if(tahmin > bilgisayar)
				System.out.println("Tahminin cok y�ksek");
			else
				System.out.println("Tahminin cok d�s�k");

		}
	}

}
