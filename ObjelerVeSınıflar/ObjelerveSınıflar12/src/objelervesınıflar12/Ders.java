package objelervesýnýflar12;

public class Ders {
	private String dersAdi;
	private Hoca dersHocasi;  //Hoca sinifindan bir nesne olusturduk
	private Ogrenci [] ogrenciler;  //Ogrenci sinifindan ogrencileri tututacak nesne dizisi yarattik
    private int ogrenciSayisi=0;
    
    public Ders(String dersAdi)
    {
    	this.dersAdi=dersAdi;
    	ogrenciler=new Ogrenci[80];
    	
    }
    
    public Hoca getDersHocasi()
    {
    	return dersHocasi;
    }
    
    public void setDersHocasi(Hoca h)
    {
    	this.dersHocasi=h;
    }
    
    public void ogrenciEkle(Ogrenci o)
    {
    	ogrenciler[ogrenciSayisi]=o;  //ogrenciSayisi basta 0 oldugundan dizinin 0. elemanina ekliycek sonra ogrenci sayisini 1 yapýnca bir sonraki ogrenciyi dizinin 1.elemanina ekliycek
    	this.ogrenciSayisi++;
    }
    
    public int getOgrenciSayisi()
    {
    	return ogrenciSayisi;
    }
    
    public void ogrenciBilgileri()
    {
    	for(int i=0;i<ogrenciSayisi;i++)
    	{
    		System.out.println(ogrenciler[i].toString());
    	}
    }
    
    
    
    
    
    
    
}
