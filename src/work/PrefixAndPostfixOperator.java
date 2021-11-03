package work;

public class PrefixAndPostfixOperator {

	public static void main(String[] args) {
		 
		int n=35;
		float x =12.7f;
		
		System.out.format("n = %d iken --n =%d ve n= %d olur.  %n", n,--n,n );
		// n=34
		System.out.format("n= %d iken ++n= %d ve n = %d olur. %n" , n,++n,n);
		// n=35
		System.out.format("n= %d iken n-- =%d ve n = %d olur.  %n",n,n--,n);
		// n=34
		System.out.format("n= %d iken n++ =%d ve n= %d olur. %n" ,n,n++,++n);
		// n =35
		System.out.println();
		System.out.format("x= %f iken --x= %f ve x= %f olur. %n",x,--x,x );
		// x =11.7
		System.out.format("x= %f iken ++x= %f ve x= %f olur. %n",x,++x,x);
		// x=12.7
		System.out.format("x= %f iken x--= %f ve x= %f olur. %n",x,x--,x);
		//x =11.7
		System.out.format("x= %f iklen x++= %f ve x= %f olur. %n",x,x++,x);
		//12.7
	}

}
