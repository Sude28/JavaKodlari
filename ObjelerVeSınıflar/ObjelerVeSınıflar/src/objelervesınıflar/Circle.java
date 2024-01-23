package objelervesýnýflar;

class Circle {
	/* Dairenin yaricapi */
	double radius = 1;
	
	/* Daire objesi olusturduk*/
	Circle(){

}
	/* Daire objesi olusturduk*/
	Circle(double newRadius){
		radius = newRadius;	
	}
	
	/* Dairenin alanini dondurur*/
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	/*Dairenin cevresini dondurur*/
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}	 
	 
	/*Daire icin yeni yaricap ayarlar*/
	double setRadius(double newRadius) {
	    radius = newRadius;
	}	
}
 
//main methodu olmadigindan calistirilamaz sadece nesne ve objeleri anlamak icin bir ornek //


