package diziler5;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		int matris[][] = new int[10][10];
		
		for(int i =0; i < matris.length; i++)
			for(int j = 0; j < matris[i].length; j++)
				matris[i][j] = (int) (Math.random() * 100);
		
		for(int i =0; i < matris.length; i++) {
			for(int j = 0; j < matris[i].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}

}
 