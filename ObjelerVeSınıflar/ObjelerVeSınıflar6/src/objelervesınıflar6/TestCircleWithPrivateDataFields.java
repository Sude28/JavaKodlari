package objelerves�n�flar6;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// yar��ap� 5.0 olan bir �ember olu�turun
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		//myCircle'�n yar��ap�n� %10 art�r
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
	}
}
