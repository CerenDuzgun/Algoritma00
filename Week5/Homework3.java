import java.util.Scanner;
public class Homework3 {
   
    //Girilen sayı= a*a + b*b eşitliğini sağlayan, a ve b sayılarını yazdıran program.
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      System.out.println("lütfen bir sayı giriniz.");
      int sayi =input.nextInt();
      int a,b;
        for ( a = 1; a < sayi ; a++) {
            for ( b = 1; b < sayi; b++) {
                 if(sayi== a*a+b*b) {
                  System.out.println(a+"*"+b+"eşit"+sayi );
               }
            }
        }
    }
    
}
