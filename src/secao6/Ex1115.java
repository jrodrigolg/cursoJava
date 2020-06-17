package secao6;

import java.util.Scanner;

public class Ex1115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0) {
				if (y > 0) {
					System.out.println("primeiro");
				} else {
					System.out.println("quarto");
				}
			}

			else {

				if (y > 0) {
					System.out.println("segundo");
				} else {
					System.out.println("terceiro");
				}
			}
			
		}while (x != 0 && y != 0);
		sc.close();
	}

}
