package objelerves�n�flar9;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	//Varsay�lan kapasite 16 olan bir constructor olustururuz
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);   //this ile parametreli consructoru cagiririz.
	}
	
	//Belirtilen maksimum kapasiteye sahip bir y���n olu�tururuz
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	//Y���n�n �st�ne yeni bir tamsay� ekleyin
	public void push(int value) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);  //tempe yazilir elementstekiler 0.pozisyondan itibaren
			elements = temp;  //diziyi kopyaladiktan sonra referansini atadik
		}
		elements[size++] = value; //ife girmiyor dolu degilse yani
	}
	
	//Geri d�n�n ve �st ��eyi y���ndan kald�r�n
	public int pop() {
		return elements[--size];
	}
	
	// En �stteki eleman� y���ndan d�nd�r
	public int peek() {
		return elements[size-1];
	}
	
	//Y���n�n bo� olup olmad���n� s�nama
	public boolean empty() {
		return size == 0;
	}
	
	//Y���ndaki ��e say�s�n� d�nd�r�r
	public int getSize() {
		return size;
	}
	
}	