package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int[] diag = new int[n];
		int x = 0;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				if (i==j) {
					diag[i]=mat[i][j];
					
				}
				if((mat[i][j] < 0)){
					x+=1;
				}
			}
		}
		
		System.out.println("diagonal pricipal:");
		for (int i = 0; i < n ; i++) {
			System.out.print(diag[i]+" ");
		}
		System.out.println();
		System.out.println("negativos:" + x);
		sc.close();
	}

}
