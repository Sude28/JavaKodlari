package döngüler2;

import java.util.Scanner;

public class SentinalValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz. (0 girerseniz program sonlanir): ");
		int data = input.nextInt();
		
		int toplam = 0;
		while(data != 0) {
			toplam += data;
			
			System.out.print("Bir sayi giriniz. (0 girerseniz program sonlanir): ");
		    data = input.nextInt();
				
		}
		
		System.out.println("Toplam: " + toplam);
		
}
}