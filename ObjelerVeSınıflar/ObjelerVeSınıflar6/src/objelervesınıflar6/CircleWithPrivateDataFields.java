package objelervesınıflar6;

public class CircleWithPrivateDataFields {
	private double radius = 1;
	
	private static int numberOfObjects = 0;    //olusturulan nesnelerin sayisi
	
	public CircleWithPrivateDataFields() {     //yaricapi 1 olan bir daire olusturun
		numberOfObjects++;
	}
	
	public CircleWithPrivateDataFields(double newRadius) {    //Belirli bir yarıçapa sahip bir daire oluşturun
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {   //getter metodu ile private degiskene eristik
		return radius;
	}
	
	public void setRadius(double newRadius) {    //setter metodu ile private olan radius degiskenini degistirdik
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
