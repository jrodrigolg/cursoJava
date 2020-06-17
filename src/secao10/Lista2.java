package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		//adicionando elementos na lista
		list.add("maria");
		list.add("Alex");
		list.add("bob");
		list.add("anna");
		list.add(2,"marco");
		
		
		for(String nomes:list) {
			System.out.println(nomes);
		}
		
		list.remove(1);	//remove o elemento na posiçao 1
		list.removeIf(x->x.charAt(0) == 'm');	//remove elemnetos q começam com "m"
		
		System.out.println("___________");
		for(String nomes:list) {
			System.out.println(nomes);
		}
		
		sc.close();
	}

}
