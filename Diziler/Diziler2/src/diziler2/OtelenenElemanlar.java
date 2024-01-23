package diziler2;

public class OtelenenElemanlar {

	public static void main(String[] args) {
		double[] myList = new double [5];
		
		
		for(int i = 0; i < myList.length; i++) {
			myList[i] = Math.random()*10;
		}
		
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.print("\n");
		
		double temp = myList[0];
		
		for(int i = 1; i < myList.length; i++) {
			myList[i-1] = myList[i];
		}
		
		myList[myList.length-1] = temp;
		
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}

}
