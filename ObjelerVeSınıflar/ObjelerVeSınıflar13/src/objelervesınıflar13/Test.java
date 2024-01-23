package objelervesýnýflar13;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Kitap k1 = new Kitap("Javayý Seviyorum", new Yazar("Mehmet","Yýlmaz","myilmaz@abc.com",56), new Date(109,1,1));
		
		System.out.println(k1.yazar_ver().yas);
				
		
	}

}
