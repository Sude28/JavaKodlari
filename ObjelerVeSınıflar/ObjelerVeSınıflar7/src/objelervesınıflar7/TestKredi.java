package objelervesýnýflar7;

import java.util.Scanner;

public class TestKredi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yýllýk faiz oranýný girin, örneðin 8.25: ");
		double yillikfaizorani = input.nextDouble();
		
		System.out.print("Tam sayý olarak yýl sayýsýný girin:");
		int yilsayisi = input.nextInt();
		
		System.out.print("Kredi tutarýný girin, örneðin 120000.95: ");
		double kreditutari = input.nextDouble();
		
		Kredi kredi = new Kredi(yillikfaizorani, yilsayisi, kreditutari);
		
		System.out.printf("Kredi %s tarihinde oluþturuldu\n" +"Aylýk ödeme %.2f\nToplam ödeme %.2f\n" , kredi.getkreditarihi().toString(), kredi.getaylikodeme(), kredi.gettoplamodeme());

	}

}
