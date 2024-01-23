package objelervesýnýflar3;

 class SimpleCircle {
	double radius;                                           //SimpleCircle sinifinin veri alani
	
	//Yaricapi 1 olan bir daire olusturduk
	SimpleCircle(){                                             //Argumani olmayan constructor
		radius = 1; 
	}

	//Belirli bir yaricapa sahip bir daire olustururuz
	SimpleCircle(double newRadius){                                 //Ikinci constructor
		radius = newRadius;
	}
	
	//Dairenin alanini dondururuz
	double getArea() {                                       //getArea Method
		return radius * radius * Math.PI;
	}
	
	//Dairenin cevresini dondururuz
	double getPerimeter() {                                   //getPerimeter Method
		return 2 * radius * Math.PI;
	}
	
	//Daire icin yeni bir yaricap belirleriz
	void setRadius(double newRadius) {                           //setRadius Method
		radius = newRadius;
	}
} 
