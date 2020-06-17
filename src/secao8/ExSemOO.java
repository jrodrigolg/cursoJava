package secao8;

import java.util.Locale;
import java.util.Scanner;
import secao8a.Triangulo;

public class ExSemOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("escreva as medida do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("escreva as medidas do triangulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble(); 
		System.out.printf("Area do triangulo X : %.4f%n",x.area());
		System.out.printf("Area do triangulo Y : %.4f%n",y.area());
		
		if ( x.area()>y.area()) {
			System.out.println("a maior area: X");
		}
		else {
			System.out.println("a maior area: Y");
		}
		sc.close();
	}

}
