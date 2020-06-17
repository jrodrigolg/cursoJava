package secao7;

import java.util.Scanner;

public class BitBit {

	public static void main(String[] args) {
		int x;
		int y=0b00100000;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if ((x & y)!=0) {
			System.out.println("6 bit é verdadero");
		}
		else {
			System.out.println("falso");
		}
		sc.close();
	}
	
}
