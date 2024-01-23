package objelervesýnýflar12;

public class TestHoca {

	public static void main(String[] args) {
		Hoca TurgayHoca = new Hoca(); //boþ constructoru kullanarak nesne okusturduk
		Hoca ErgunHoca = new Hoca("Ergun","Bilgisayar Muh.",40,"dr. ogretim uyesi","erkek");
		Hoca EsmaHoca = new Hoca("Esma","Bilgisayar Muh.",25,"ar. gor","kadýn");
		Hoca UgurHoca = new Hoca("Ugur","Bilgisayar Muh.",26,"ar. gor","erkek");
	    Hoca AhmetHoca = new Hoca("Ahmet","Bilgisayar Muh.",26,"ar. gor","erkek");
	
	    TurgayHoca.setAd("Turgay Tugay");
	    TurgayHoca.setBolum("Bilgisayar Muh.");
	    TurgayHoca.setCinsiyet("erkek");
	    TurgayHoca.setUnvan("prof. dr.");
	    TurgayHoca.setCinsiyet("erkek");
	    TurgayHoca.setYas(41);
	    
	    Hoca[] hocaDizisi = new Hoca[5];
	    hocaDizisi[0] = TurgayHoca;
	    hocaDizisi[1] = ErgunHoca;
	    hocaDizisi[2] = EsmaHoca;
	    hocaDizisi[3] = UgurHoca;
	    hocaDizisi[4] = AhmetHoca;
	    
	    for(int i=0;i<5;i++)
	    {
	    	System.out.println(hocaDizisi[i].toString());
	    }
	    
	    Hoca.kurum = "Bursa Teknik Üniversitesi";  //static oldugundan nesne olusturmadan eristik ve yazdirdik
	    System.out.println(Hoca.kurum);
	}
	

}
