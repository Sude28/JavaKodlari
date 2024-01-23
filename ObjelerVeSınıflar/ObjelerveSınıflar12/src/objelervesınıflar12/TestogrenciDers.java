package objelervesýnýflar12;

public class TestogrenciDers {

	public static void main(String[] args) {
		Ogrenci o1 = new Ogrenci("sude","telli","bilgisayar müh",21360);  // constructor olustururken bu parametreleri verdigimiz icin girdik. o1 nesnesi olusturduk cunku baska sýnýftaki bir degiskene boyle erisebiliriz
		Ogrenci o2 = new Ogrenci("buse","telli","gýda müh",21332);
		Ogrenci o3 = new Ogrenci("sena","dikici","bilgisayar müh",1235);
		
		Hoca h1 = new Hoca("ergün","bilgisayar müh",40,"dr. ogretim uyesi","erkek");
		
		Ders d1 = new Ders("Nesneye Yönelik Programlama");
		
		d1.setDersHocasi(h1);
		d1.ogrenciEkle(o1);
		d1.ogrenciEkle(o2);
		d1.ogrenciEkle(o3); 
		System.out.println("Dersi alan ogrenciler: ");
		d1.ogrenciBilgileri();
		
		
		

	}

}
