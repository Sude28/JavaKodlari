package objelerves�n�flar7;

import java.util.Scanner;

public class TestKredi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Y�ll�k faiz oran�n� girin, �rne�in 8.25: ");
		double yillikfaizorani = input.nextDouble();
		
		System.out.print("Tam say� olarak y�l say�s�n� girin:");
		int yilsayisi = input.nextInt();
		
		System.out.print("Kredi tutar�n� girin, �rne�in 120000.95: ");
		double kreditutari = input.nextDouble();
		
		Kredi kredi = new Kredi(yillikfaizorani, yilsayisi, kreditutari);
		
		System.out.printf("Kredi %s tarihinde olu�turuldu\n" +"Ayl�k �deme %.2f\nToplam �deme %.2f\n" , kredi.getkreditarihi().toString(), kredi.getaylikodeme(), kredi.gettoplamodeme());

	}

}
