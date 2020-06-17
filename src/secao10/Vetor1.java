package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i]= new Product(name, price);
		}
		
		double sum = 0.0;
		for (int j = 0; j < vect.length; j++) {
			sum += vect[j].getPrice();
		}
		double avg = sum/n;
		System.out.printf("average price = %.2f", avg);
		sc.close();
	}

}
