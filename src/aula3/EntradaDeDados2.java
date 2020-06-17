package aula3;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		int x1;
		double x2;
		char x3;
		String x4;
		Scanner sc;
		
		sc = new Scanner(System.in);
		x1 = sc.nextInt();
		x2 = sc.nextDouble();
		x3 = sc.next().charAt(0);
		sc.nextLine();
		x4 = sc.nextLine();
		
		System.out.println("dados:");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		// ctrl+shift+f autoidentaçao
		sc.close();
		

	}

}
