package döngüler4;

import java.util.Scanner;

public class EnBuyukOrtakBolen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.sayiyi giriniz: ");
		int n1 = input.nextInt();
		System.out.print("2.sayiyi giriniz: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k = 2;
		while(k <= n1 && k <= n2) {
			if(n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		
		System.out.println(n1 + " ve " + n2 + " en buyuk ortak bolenleri " + gcd);
			
		
	}

}
