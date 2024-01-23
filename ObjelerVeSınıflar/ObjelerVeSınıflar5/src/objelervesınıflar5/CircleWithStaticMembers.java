package objelervesýnýflar5;

public class CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects = 0;  //Olusturulan nesnelerin sayisi
	
	CircleWithStaticMembers (){       //Contract ile yaricapi 1 olan daire olusturduk
		radius = 1.0;
		numberOfObjects++;	
	}
	
	CircleWithStaticMembers(double newRadius){    //Constract ile herhangi bir yaricapa sahip daire olusturduk
		radius = newRadius;                       //Bu iki constract overloading. Ayni ada sahip iki constractý farkli degiskenlerle cagirdik
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
