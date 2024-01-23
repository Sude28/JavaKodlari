package objelervesýnýflar6;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// yarýçapý 5.0 olan bir Çember oluþturun
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		//myCircle'ýn yarýçapýný %10 artýr
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
	}
}
