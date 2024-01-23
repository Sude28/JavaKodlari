package diziler7;

public class DüzensizDiziler {
	
	public static void ekranaYazdir(int dizi[][])
	{
		int satir=dizi.length;  //satir uzunlugunu bulduk
		int sutun[]=new int[satir]; //sutun sayisini tutacagimiz dizi
		
		for(int i=0;i<satir;i++)
		{
			sutun[i]=dizi[i].length;  //satir kadar calistirip her sutunun uzunlugunu bulduk
		}
		
		for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun[i];j++)
			{
				System.out.print(" "+dizi[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static int[][] elemanKaydir(int dizi[][],int adim)
	{
		int x=dizi.length;
		int degistirilmisDizi[][]=new int[x][];
		for(int i=0;i<x;i++)
		{
			degistirilmisDizi[i]=new int[dizi[i].length];
		}
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<dizi[i].length;j++)
			{
				degistirilmisDizi[i][(j+adim)%(dizi[i].length)]=dizi[i][j]; // dizinin elemanini j adim kaydirdik eger dizinin uzunlugundan fazla olursa diye modunu aldýk
			}
		}
		
		return degistirilmisDizi;			
	}

	public static void main(String[] args) {
		int [][] dizi = new int[3][];
		
		dizi[0]=new int [5];  //matrisin her satiri ayni buyuklukte olmadigi icin farkli buyuklukteki satir olmasi icin dizi icinde dizi tanimliyoruz her satir bir dizi oluyor
		dizi[1]=new int [3];
		dizi[2]=new int [2];
		
		for(int i=0;i<5;i++)
		{
			dizi[0][i]=(i+1)*10;
		}
		
		for(int i=0;i<3;i++)
		{
			dizi[1][i]=(i+1)*5;
		}
		
		for(int i=0;i<2;i++)
		{
			dizi[2][i]=(i+1)*2;
		}	
		
		ekranaYazdir(dizi);
		int yeniDizi[][]=elemanKaydir(dizi,3);
		ekranaYazdir(yeniDizi);
		
		
		
	}

}
