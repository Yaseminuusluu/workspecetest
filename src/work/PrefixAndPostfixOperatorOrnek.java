package work;

public class PrefixAndPostfixOperatorOrnek {

	public static void main(String[] args) {
		
		int say�=0;
		int �rnekiArt�m;
		int �rnekiEksim;
		int postfixArt�m;
		int postfixEksim;
		int pozitif;
		int negatif; 	
		byte bitNot;
		boolean logNot;
		
		�rnekiArt�m = ++say�;
		System.out.println("�rnek-Art�m=" + �rnekiArt�m);	 
		�rnekiEksim = --say�;
		System.out.println("�rnek-Eksim" + �rnekiEksim);
		postfixArt�m = say� ++ ;
		System.out.println("postfix-Art�m" + postfixArt�m);
		postfixEksim = say� --;
		System.out.println("postfix-Eksim" + postfixEksim);
		System.out.println("say� 'nin son degeri=" + say� );
		pozitif = -postfixArt�m;
		System.out.println("Pozitif=" + pozitif);
		negatif = +postfixArt�m;
		System.out.println("Negatif=" + negatif);
		bitNot = 0;
		bitNot = (byte) (~bitNot);
		System.out.println("Bitwise Not =" + bitNot);
		logNot= false;
		logNot = !logNot;
		System.out.println("Logical Not=" + logNot);
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
      
	}

}
