
import java.util.Scanner;
public class Homework2 {
    // Kenar uzunlukları verilen üçgenin türünü yazdıran program.
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen üç kenarın, alt alta olacak şekilde, uzunluklarını giriniz.");
       int sayi1= input.nextInt();
       int sayi2= input.nextInt();
       int sayi3= input.nextInt();
       if (sayi1==sayi2 && sayi1==sayi3){
          System.out.println("Eşkenar");
       }
       else if( sayi1!=sayi2 && sayi1!=sayi3 && sayi2!=sayi3)
       {
          System.out.println("Çeşitkenar");}
       
       else if((sayi1==sayi2 && sayi1!=sayi3)|| (sayi1==sayi3 && sayi3!=sayi2)|| (sayi2==sayi3 && sayi2!=sayi1)){
            
          System.out.println("ikizkenar");}
       
       else { System.out.println("Lütfen geçerli sayılar giriniz.");}
    }
    
}
