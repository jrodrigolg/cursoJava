package secao7;

public class String1 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 10);
		String s06 = original.replace("a", "x");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("original: "+original+"-");
		System.out.println("toLowerCase: "+s01+"-");
		System.out.println("toUpperCase: "+s02+"-");
		System.out.println("trim: "+s03+"-");
		System.out.println("substring(i): "+s04+"-");
		System.out.println("substring(i,f) "+s05);
		System.out.println("replace "+s06);
		System.out.println("indexOf"+i);
		System.out.println("lasIndexOf"+j);
		
		String s = "batata acelora banana goiaba";
		String[] vect = s.split(" ");
		for(int x=0;x<4;x++) {
			System.out.println(vect[x]);
		}
		
		
	}
}
