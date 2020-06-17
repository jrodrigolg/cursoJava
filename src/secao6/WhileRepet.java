package secao6;

import java.util.Scanner;

public class WhileRepet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		Scanner sc = new Scanner(System.in);
		while (x!=0) {
			System.out.println("x?");
			x= sc.nextInt();
		}
		sc.close();
		System.out.println("terminÔ");
		
	}

}
