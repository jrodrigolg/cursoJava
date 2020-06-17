package secao7;

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("escreva os 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		escrever(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		aux = x;
		if (y > aux) {
			aux = y;
		}
		if (z > aux) {
			aux = z;
		}
		return aux;
	}
	
	public static void escrever(int m) {
		System.out.println(m);
	}

}
