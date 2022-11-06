
import java.util.Scanner;
public class Homework5 {
    
    // 1'den n'e kadar olan tek sayıların toplamını yazdıran program.
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int n = input.nextInt();
      int toplam=0;
      int sayac=1;
      while (sayac<=n)
      {
         toplam=toplam+sayac;
         sayac=sayac+2;
      }
      System.out.println(toplam);
    }
    
}
