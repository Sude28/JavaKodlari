package objelervesýnýflar5;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Nesneleri olusturmadan once ");
		System.out.println("Circle nesnelerinin sayisi " + CircleWithStaticMembers.numberOfObjects);
		
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();   //c1'i olusturduk
		
		//c2 olusturulmadan once c1'i goruntuledik
		System.out.println("\n c1'i olusturduktan sonra");
		System.out.println("c1: radius (" + c1.radius + ") ve Circle nesnelerinin sayisi (" + c1.numberOfObjects + ")");
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);   //c2'yi olusturduk
		
		//c1'i degisitir
		c1.radius = 9;
		
		//c1 ve c2'yi c2 olusturulduktan sonra goster
		System.out.println("\n c2 oluþturduktan ve c1'i deðiþtirdikten sonra");
		System.out.println("c1: radius (" + c1.radius + ") ve Circle nesnelerinin sayisi (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") ve Circle nesnelerinin sayisi (" +c2.numberOfObjects + ")");
		

	}

}
