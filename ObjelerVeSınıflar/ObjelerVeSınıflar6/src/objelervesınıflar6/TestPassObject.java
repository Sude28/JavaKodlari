package objelerves�n�flar6;

public class TestPassObject {

	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle =new CircleWithPrivateDataFields(1);
		
		//Yar��ap 1, 2, 3, 4 ve 5 i�in alanlar� yazd�r�n.
		int n = 5;
		printAreas(myCircle, n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	//Yar��ap i�in bir alan tablosu yazd�r�n
	public static void printAreas(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius \t\tArea");
		while (times >=1) {
			System.out.println(c.getRadius() + "\t\t " + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
