import java.util.Scanner;
public class project_6_101 {

    /*Klavyeden girilen üst sınıra kadar olan tau sayılarını listeleyen program.
     Tau sayıları bir sayının, pozitif tam bölenlerinin sayısına tam bölünebilen sayılara denir.
    */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       int sinir = input.nextInt(); 
       int bolens;//Bölen sayısını ifade eder.
        for (int sayi = 1; sayi <= sinir; sayi++) {
             bolens=0;// Her sayı için bölen sayısının doğru çıkması için.
            for (int bolen = 1; bolen <=sayi; bolen++) {
                
                if (sayi%bolen==0) { //bolen değişkeni sayiyi tam bölüyorsa
                    bolens++;
                }
            }
            if (sayi%bolens==0) {
                System.out.println(sayi);
            }
            
           
            
       
            }
        }
    }








