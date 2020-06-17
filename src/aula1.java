import java.util.Locale;

public class aula1 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("hello world");
		System.out.println("olá");
		
		double y=10.333333;
		System.out.printf("%.2f\n",y);
		System.out.print("ola\n"+y);
	}

}
