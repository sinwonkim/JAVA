package javajava;

public class DoubleFor {
	public static void main(String[] args) {
		int k = 0;
		int o = 0;
		int[][] table = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				k += 1;
				 table[i][j] = k;
				 System.out.print(" "+table[i][j]);
			}
			o +=1;
			System.out.println("  "+o+"행");
		}
	}
}
