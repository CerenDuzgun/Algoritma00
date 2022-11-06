

import java.util.Scanner;

public class Homework1 {

  //  (Üçgenin Alanı)
    
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in) ;
      System.out.println("Lütfen bir uzunluk değeri giriniz.");
      int uzunluk = input.nextInt();
      System.out.println("Lütfen bir yükseklik değeri giriniz.");
      int yükseklik = input.nextInt();
      System.out.println("üçgenin alanı="+ (uzunluk*yükseklik)/2);
    }
    
}
