package work;

public class PrefixAndPostfixOperatorOrnek {

	public static void main(String[] args) {
		
		int sayý=0;
		int örnekiArtým;
		int örnekiEksim;
		int postfixArtým;
		int postfixEksim;
		int pozitif;
		int negatif; 	
		byte bitNot;
		boolean logNot;
		
		örnekiArtým = ++sayý;
		System.out.println("örnek-Artým=" + örnekiArtým);	 
		örnekiEksim = --sayý;
		System.out.println("örnek-Eksim" + örnekiEksim);
		postfixArtým = sayý ++ ;
		System.out.println("postfix-Artým" + postfixArtým);
		postfixEksim = sayý --;
		System.out.println("postfix-Eksim" + postfixEksim);
		System.out.println("sayý 'nin son degeri=" + sayý );
		pozitif = -postfixArtým;
		System.out.println("Pozitif=" + pozitif);
		negatif = +postfixArtým;
		System.out.println("Negatif=" + negatif);
		bitNot = 0;
		bitNot = (byte) (~bitNot);
		System.out.println("Bitwise Not =" + bitNot);
		logNot= false;
		logNot = !logNot;
		System.out.println("Logical Not=" + logNot);
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
      
	}

}
