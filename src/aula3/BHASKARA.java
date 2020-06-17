package aula3;

import java.util.Scanner;

public class BHASKARA {

	public static void main(String[] args) {
		double x1,x2,a,b,c,delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero(a)");
		a=sc.nextDouble();
		System.out.println("digite o segundo numero(b)");
		b=sc.nextDouble();
		System.out.println("digite o terceiro numero(c)");
		c=sc.nextDouble();
		delta = (double)Math.pow(b, 2)-4*a*c;
		System.out.println("delta = "+delta);
		x1 = (float)(-b+Math.sqrt(delta)/(2*a));
		x2 = (float)(-b-Math.sqrt(delta)/(2*a));
		System.out.printf("X1 = %.2f\n", x1);
		System.out.printf("X2 = %.2f\n", x2);
		sc.close();

	}

}
