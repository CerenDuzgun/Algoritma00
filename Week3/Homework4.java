
import java.util.Scanner;
public class Homework4 {
// 1'den n'e kadar olan sayıların karelerinin toplamını yazdıran program.
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          System.out.println("Lütfen bir n sayısı giriniz."); 
          
          int n= input.nextInt();
          int toplam=0;
          int sayac=1;
          while (sayac<=n)
          {
             toplam = toplam + (sayac*sayac);
             sayac =sayac +1;
          }
          
          System.out.println(toplam);
    }
    
}
