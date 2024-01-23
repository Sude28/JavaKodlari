package objelervesýnýflar6;

public class TotalArea {

	public static void main(String[] args) {
		//daire dizisini bildir
		CircleWithPrivateDataFields[] circleArray;
		
		//daire dizisini olustur
		circleArray = createCircleArray();
		
		//CircleArray'i ve dairelerin toplam alanlarýný yazdýrýn
		printCircleArray(circleArray);
	}
	
	//Circle nesne dizisi olustur
	public static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for (int i =0; i< circleArray.length; i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	//Daire dizisini ve toplam alanlarini yazdir
	public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n" , "Radius" , "Area");
		for(int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
			
		}
		
		System.out.println("------------------------------------");
		
		//Sonucu hesaplayýn ve görüntüleyin
		System.out.printf("%-30s%-15f\n", "The total areas of circles is", sum(circleArray));
	}
	
	//Daire alanlari ekle
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		//Toplami baþlat
		double sum =0;
		
		//Toplama alanlari ekle
		for(int i =0; i < circleArray.length; i++)
			sum += circleArray[i].getArea();
		
		return sum;
	}
}
