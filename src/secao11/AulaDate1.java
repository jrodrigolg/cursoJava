package secao11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AulaDate1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Date hoje = new Date();
		System.out.println(hoje.getTime());
		
		
		
		
		sc.close();
	}

}
