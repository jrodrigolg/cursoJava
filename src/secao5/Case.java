package secao5;

import java.util.Scanner;

public class Case {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch(x) {
		case 1:
			dia = "domigo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quata";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "cesta";
			break;
		case 7:
			dia = "sabaddo";
			break;
		default:
			dia = "invalido";
			break;
		}
		System.out.println(dia);
		sc.close();
		
	}

}
