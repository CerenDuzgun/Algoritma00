import java.util.Scanner;
public class project_6_105 {

    /*Girilen sayının aritmetik sayı olup olmadığını yazdıran program.
    
    Aritmetik sayı: Herhangi pozitif bir tamsayının, pozitif tam bölenlerinin ortalaması
    bir tamsayı ise bu sayılara "Aritmetik Sayı" denir.
    */
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int sayi=input.nextInt();
     int bolen_sayisi=0;
     int toplam=0;
        for (int bolen = 1; bolen <=sayi; bolen++) { 
            if (sayi%bolen==0) {      
            
               bolen_sayisi++;    //bölen_sayisi değişkeni girilen sayının bölen sayısını ifade eder.
               toplam+=bolen;     // toplam değişkeni girilen sayının pozitif tam bölenlerinin toplamını ifade eder.
            }
        }
        if (toplam%bolen_sayisi==0) { //Eğer girilen sayının pozitif bölenlerinin toplamı bölen sayısına tam bölünürse,
                                      // bu sayının aritmetik sayı olduğunu yazdırır.
                                      
            System.out.println("Girdiğiniz sayı bir aritmetik sayıdır.");
        }
        else{
            System.out.println("Girdiğiniz sayı aritmetik sayı değildir."); //Aksi takdirde aritmetik sayı olmadığını yazdırır.
        }
    }
    
}
