package objelervesýnýflar12;

public class Ogrenci {
	private String isim;
	private String soyisim;
	private int ogrenciNo;
	private String bolum;
	
	public Ogrenci(String isim, String soyisim, String bolum, int ogrenciNo)
	{
		this.isim=isim; //yukarida ilk degiskene constructordeki degiskeni atiyoruz
		this.soyisim=soyisim;
		this.bolum=bolum;
		this.ogrenciNo=ogrenciNo;
	}
	
	public String getIsim()
	{
		return isim;
	}
	
	public void setIsim(String isim)
	{
		this.isim=isim;
	}
	
	public String getsoyIsim()
	{
		return soyisim;
	}
	
	public void setAd(String soyisim)
	{
		this.soyisim=soyisim;
	}
	
	public int getogrenciNo()
	{
		return ogrenciNo;
	}
	
	public void setOgrenciNo(int ogrenciNo)
	{
		this.ogrenciNo=ogrenciNo;
	}
	
	public String getbolum()
	{
		return bolum;
	}
	
	public void setbolum(String bolum)
	{
		this.bolum=bolum;
	}
	
	public String toString()
	{
		return "ad: "+isim+
				"\n soyad: "+soyisim+
				"\n ogrenci no: "+ogrenciNo+
				"\n bolum: "+bolum;
	}
		
	
	

}
