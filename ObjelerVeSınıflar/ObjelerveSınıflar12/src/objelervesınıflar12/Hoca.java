package objelervesýnýflar12;

public class Hoca {
	private String ad;
	private String bolum;
	private int yas;
	private String unvan;
	private String cinsiyet;
	static String kurum;

	public Hoca(String ad, String bolum, int yas, String unvan, String cinsiyet)
	{
		this.ad=ad;
		this.bolum=bolum;
		this.yas=yas;
		this.unvan=unvan;
		this.cinsiyet=cinsiyet;
	}
	
	public Hoca()
	{
		
	}
	
	public String getAd()
	{
		return ad;
	}
	
	public void setAd(String ad)
	{
		this.ad=ad;
	}
	
	public String getBolum()
	{
		return bolum;
	}
	
	public void setBolum(String bolum)
	{
		this.bolum=bolum;
	}
	
	public int getYas()
	{
		return yas;
	}
	
	public void setYas(int yas)
	{
		this.yas=yas;
	}
	
	public String getUnvan()
	{
		return unvan;
	}
	
	public void setUnvan(String unvan)
	{
		this.unvan=unvan;
	}
	
	public String getCinsiyet()
	{
		return cinsiyet;
	}
	
	public void setCinsiyet(String cinsiyet)
	{
		this.cinsiyet=cinsiyet;;
	}
	
	//Override
	public String toString()
	{
		return "ad: "+ad+"\n"+
	           "bölüm: "+bolum+"\n"+
			   "yaþ: "+yas+"\n"+
			   "unvan: "+unvan+"\n"+
			   "cinsiyet: "+cinsiyet+"\n";
	}
	
}
