package MirasVePolimorfizm3;

public class Polimorfizm {
		public static void nesneAl(Canli c) {
			c.yaz();
		}

	public static void main(String[] args) {
		Canli[] h = new Canli[3];
		for (int i=0;i<3;i++) {
			int indis = (int)(Math.random()*3);    //Dyanamic Binding :Nesnenin turu calisma zamaninda belirlenirse dinamik baglama denir. Random olarak belirleniyor hangi nesne olacagi
			switch(indis) {
			case 0:
				h[indis] = new Bitki();
				nesneAl(h[indis]);
				break;
				
			case 1:
				h[indis] = new Hayvan();
				nesneAl(h[indis]);
				break;
				
			case 2:
				h[indis] = new Insan();
				nesneAl(h[indis]);
				break;	
			}
		}
	}
}
