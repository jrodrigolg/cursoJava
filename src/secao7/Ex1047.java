package secao7;

import java.util.Scanner;

public class Ex1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mf = 0, hf = 0;
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		sc.close();

		h1 *= 60;
		h2 *= 60;
		h1 += m1;
		h2 += m2;

		int hfm = 1440 - h1 + h2;
		if (hfm > 1440) {
			hfm -= 1440;
		}
		hf = hfm / 60;
		mf = hfm % 60;
		System.out.println("O JOGO DUROU " + hf + " HORA(S) E " + mf + " MINUTO(S)");
		
	}

}
