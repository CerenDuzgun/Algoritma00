
import java.util.Scanner;
public class Homework7 {

   
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      System.out.println("Lütfen yükseklik değerini giriniz.");
      Double yukseklik = input.nextDouble();
      System.out.println("Lütfen uzun kenarı giriniz.");
      Double uzunkenar= input.nextDouble();
      System.out.println("lütfen kısa kenarı giriniz.");
      Double kısakenar= input.nextDouble();
      System.out.println("Dikdörtgen prizmanın hacmi="+ yukseklik * uzunkenar*kısakenar);
    
    }
    
}
