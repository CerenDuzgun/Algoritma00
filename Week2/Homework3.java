
import java.util.Scanner;

public class Homework3 {
    
    //Kürenin hacmi ve alanı
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in) ;
      
       System.out.println("Lütfen yarıçap değerini giriniz.");
       double Yarıçap =input.nextDouble() ;
       double pi=3;
       double rkup= Math.pow(Yarıçap,3);
       double rkare= Math.pow(Yarıçap,2);
       double hacim = (4*pi*rkup ) /3  ;
       double alan = 4*pi* rkare ;
       System.out.println("hacim="+ hacim+ "alan=" + alan);
    }
    
}
