package objelerves�n�flar3;

public class TestSimpleCircle {

	public static void main(String[] args) {
		// Yar��ap� 1 olan bir daire olu�tur
		SimpleCircle circle1 = new SimpleCircle(); //Bir sinifa ait bir obje olustururken once sinifin adi sonra objenin adi = new ile birlikte o s�n�fa ait bir fonksiyonu cagiririz.
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		// Yar��ap� 25 olan bir daire olu�tur
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		// Yar��ap� 125 olan bir daire olu�tur
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		//Daire yaricapini degistir
		circle2.radius = 100;  //veya circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
}

//** BIZ BU ORNEGI IKI FARKLI SINIF OLUSTURARAK YAPTIK BIRLESTIRILIP BIR SINIFDA YAPILABILIR HEPSI. KITABIN 349. SAYFASINDA ORNEGI VAR **//