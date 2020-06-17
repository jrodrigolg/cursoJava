package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Aria");//adicionar elemento na lista
		list.add("Ario");
		list.add("Arina");
		list.add(3, "marco");
		list.remove("Aria");
		System.out.println(list.size());//tamanho da lista
		
		
		for (String x:list) {//for each
			System.out.println(x);
		}
		
		
		System.out.println("---------");
		list.removeIf(y -> y.charAt(0)=='m');
		for (String z:list) {//for each
			System.out.println(z);
		}
		
		
		System.out.println("---------");
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		
		
		for(String x:result) {
			System.out.println(x);
		}
		
		
		System.out.println("---------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
