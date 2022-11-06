
import java.util.Scanner;
public class Homework4 {
    /*Kütlesi, hızı ve yerden yüksekliği girilen cismin kinetik ve potansiyel enerjisini 
      yazdıran program.
    */
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("lütfen kütle değeri giriniz.");
      double kütle= input.nextDouble();
      System.out.println("Lütfen hız değerini giriniz.");
      double hız= input.nextDouble();
      System.out.println("Lütfen yerden yüksekliği giriniz.");
      double yukseklik= input.nextDouble();
      System.out.println("Potansiyel enerji="+ kütle *10* yukseklik);
      System.out.println("Kinetik enerji=" +kütle*hız*hız /2);
    }
    
}
