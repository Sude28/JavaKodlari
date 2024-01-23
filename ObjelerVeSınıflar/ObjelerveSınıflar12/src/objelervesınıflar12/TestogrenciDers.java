package objelerves�n�flar12;

public class TestogrenciDers {

	public static void main(String[] args) {
		Ogrenci o1 = new Ogrenci("sude","telli","bilgisayar m�h",21360);  // constructor olustururken bu parametreleri verdigimiz icin girdik. o1 nesnesi olusturduk cunku baska s�n�ftaki bir degiskene boyle erisebiliriz
		Ogrenci o2 = new Ogrenci("buse","telli","g�da m�h",21332);
		Ogrenci o3 = new Ogrenci("sena","dikici","bilgisayar m�h",1235);
		
		Hoca h1 = new Hoca("erg�n","bilgisayar m�h",40,"dr. ogretim uyesi","erkek");
		
		Ders d1 = new Ders("Nesneye Y�nelik Programlama");
		
		d1.setDersHocasi(h1);
		d1.ogrenciEkle(o1);
		d1.ogrenciEkle(o2);
		d1.ogrenciEkle(o3); 
		System.out.println("Dersi alan ogrenciler: ");
		d1.ogrenciBilgileri();
		
		
		

	}

}
