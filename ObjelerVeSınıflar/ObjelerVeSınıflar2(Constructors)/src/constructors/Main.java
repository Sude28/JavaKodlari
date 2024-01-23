package constructors;

public class Main {
	int x; 
	
	//Constructor sinifini main icin olusturun
	public Main() {
		x = 5; 
	}

	public static void main(String[] args) {
		Main myObj = new Main();  //Main sinifindan olusturdugumuz nesne constructoru arar // Bir sinifa ait bir obje olustururken once sinifin adini sonra objenin adi = new ile birlikte o sinifa ait fonksiyonu cagiririz. Sinifin ismiyle ayni ismi tasir yapici fonksiyon.
		System.out.println(myObj.x); //myObj adlý objenin icindeki x verisini yazdiriyor

	}

}
