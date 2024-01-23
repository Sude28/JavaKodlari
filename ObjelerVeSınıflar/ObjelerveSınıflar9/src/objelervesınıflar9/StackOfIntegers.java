package objelervesýnýflar9;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	//Varsayýlan kapasite 16 olan bir constructor olustururuz
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);   //this ile parametreli consructoru cagiririz.
	}
	
	//Belirtilen maksimum kapasiteye sahip bir yýðýn oluþtururuz
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	//Yýðýnýn üstüne yeni bir tamsayý ekleyin
	public void push(int value) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);  //tempe yazilir elementstekiler 0.pozisyondan itibaren
			elements = temp;  //diziyi kopyaladiktan sonra referansini atadik
		}
		elements[size++] = value; //ife girmiyor dolu degilse yani
	}
	
	//Geri dönün ve üst öðeyi yýðýndan kaldýrýn
	public int pop() {
		return elements[--size];
	}
	
	// En üstteki elemaný yýðýndan döndür
	public int peek() {
		return elements[size-1];
	}
	
	//Yýðýnýn boþ olup olmadýðýný sýnama
	public boolean empty() {
		return size == 0;
	}
	
	//Yýðýndaki öðe sayýsýný döndürür
	public int getSize() {
		return size;
	}
	
}	