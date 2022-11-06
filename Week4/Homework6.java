

import java.util.Scanner;
public class Homework6 {

   // Girilen sayıyı tersten yazdıran program.
    public static void main(String[]  args) {
    Scanner input = new Scanner (System.in);
     int sayi=input.nextInt();
     while (sayi>0){
       int kalan = sayi%10;
       sayi=sayi/10;
       System.out.println(kalan);}
    }
    
}
