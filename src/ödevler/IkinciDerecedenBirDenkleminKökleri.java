package ödevler;
import java.util.Scanner;
public class IkinciDerecedenBirDenkleminKökleri {

	public static void main(String[] args) {
	 
	Scanner giris = new  Scanner(System.in);
	
	System.out.println("(ax^2+bx+c=0) ikinci dereceden bir denklemdir. \n "
			+ "Denklemin sabitlerini asagýdaki gibi sýrayla giriniz.  ");
	System.out.println("a degerini giriniz :");
	double a = giris.nextDouble();
	System.out.println(" b degerini giriniz :");
	Double b = giris.nextDouble();
	System.out.println("c degerini giriniz :");
    double c = giris.nextDouble();
    
  //Diskriminant (Delta)
    
    double delta =(b*b) - (4*a*c);
   
    if (delta>0){
    	double x1 = ((-1*b) - Math.sqrt(delta)) / (2*a);
    	double x2 = ((-1*b) + Math.sqrt(delta)) / (2*a);
    	
    	System.out.println("Denklemin birinci kökü = x1 :"+ x1 );
    	System.out.println("Denklemin ikinci kökü = x2 :" + x2);
    } else if (delta==0) {
    	 double x = (-b + Math.sqrt(delta))/(2*a);
    	 System.out.println("Denklemin tek kökü: "+x);
    } else { 
    	System.out.println("Denklemin kökü yoktur");
    }
    
    
    
    
    
    
	}

}
