package diziler4;

public class GecisDizisi {

	public static void main(String[] args) {
		int[] a = {1,2};
		System.out.println("Deger Takasi yapmadan once");
		System.out.println(" dizi {" + a[0] + ", " + a[1] + "}");
		DegerTakas(a[0], a[1]);
		System.out.println("Deger Takasindan sonra"); 
		System.out.println(" dizi {" + a[0] + ", " + a[1] + "}");
		
		System.out.println("Eleman Takasi yapmadan once");
		System.out.println(" dizi {" + a[0] + ", " + a[1] + "}");
		ElemanTakas(a);
		System.out.println("Eleman Takasindan sonra");
		System.out.println(" dizi {" + a[0] + ", " + a[1] + "}");
	}
	
	public static void DegerTakas(int n1 , int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;	
	}
	
	public static void ElemanTakas(int[] dizi) {
		int temp = dizi[0];
		dizi[0] = dizi[1];
		dizi[1] = temp;
	}
}
