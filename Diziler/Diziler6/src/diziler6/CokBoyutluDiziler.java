package diziler6;

import java.util.Scanner;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[3][4];
		System.out.println("Girin "+ m.length + " satýr ve " + m[0].length + " sütun: " );
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextInt();
		
		System.out.println("Elementlerin toplamý " + sum(m));
	}
	public static int sum(int[][] m) {
		int total = 0;
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				total += m[row][column];
			}
		}
		
		return total;

	}
}
