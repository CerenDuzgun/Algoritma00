
import java.util.Scanner;
public class Homework1 {

    //Girilen sayının pozitif, negatif veya 0 olarak tanımlanması.
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir sayı giriniz.");
       int sayi= input.nextInt();
       
       if (sayi>0){
         System.out.println("Girdiğiniz sayı pozitif bir sayıdır.");
       }
       else if(sayi==0)
       {
         System.out.println("Girdiğiniz sayı sıfır.");
       }
       else {
         System.out.println("Girdiğiniz sayı negatif.");
        }
    }
    
}
