package objelervesýnýflar13;

import java.util.Date;

public class Kitap {
	private String ad;
	private Yazar yazar;
	private Date basim_yili;
	
	Kitap(String ad,Yazar yazar,Date basim_yili)
	{
		this.ad=ad;
		this.yazar=yazar;
		this.basim_yili=basim_yili;
	}
	
	public String isim_ver()
	{
		return ad;
	}
	
	public Yazar yazar_ver()
	{
		return yazar;
	}
	
	public Date tarih_ver()
	{
		return basim_yili;
	}
		
	

}
