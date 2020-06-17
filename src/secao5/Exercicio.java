package secao5;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x==1) {
			System.out.println("1");
		}
		else if (x==2) {
			System.out.println("2");
		}
		else {
			System.out.println("pão");
		}
		sc.close();
	}

}
