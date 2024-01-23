package objelervesýnýflar11;

import java.math.BigInteger;

public class ArdýsýkToplamIleCarpma {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("5");
		BigInteger y = new BigInteger("7");
		BigInteger toplam = new BigInteger("0");
		BigInteger sayac, toplanacak;
		
		if(x.compareTo(y) > 0 ) {   //ilki buyuk ise >0 oluyor x buyukse y kere calýsmalý (5+5+5+5+5+5+5) degil (7+7+7+7+7) olmali
			sayac = y;   //5 kere toplariz
			toplanacak = x;   //7'yi toplarýz
		}
		
		else {
			sayac = x;
			toplanacak = y;
		}
		
		while(sayac.compareTo(new BigInteger("0")) > 0) {
			toplam = toplam.add(toplanacak);
			sayac = sayac.add(new BigInteger("-1"));
		}
		
		System.out.println(toplam.toString());
		
		

	}

}
