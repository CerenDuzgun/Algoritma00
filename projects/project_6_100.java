import java.util.Scanner;
public class project_6_100 {

    /* Girilen sayının "eksik sayı" olup olmadığını, eksik sayı ise eksiklik 
     miktarını yazdıran program.
     Eksik sayı: Tam bölenlerinin toplamı, sayının iki katından eksik olan sayılara denir.
    */

    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      int sayi = input.nextInt();
      int bolen_toplami=0;
      
        for (int bolen = 1; bolen <= sayi; bolen++) { //Girilen sayının bölenleri bolen_toplamı değişkeninde toplanır.
            if (sayi%bolen==0) {
               bolen_toplami+=bolen; 
            }
        }
        /* Eğer ki bolen_toplami sayının 2 katından az ise, eksik sayı olduğu 
           ve eksiklik miktarı yazdırılır. Aksi takdirde eksik sayı olmadığı yazdırılır.
        */
       
        if (bolen_toplami <2*sayi) {   
          System.out.println("Girdiğiniz sayı bir eksik sayıdır.");
          System.out.println("Eksiklik miktarı:"+ (2*sayi-bolen_toplami));
        }
        else{
        System.out.println("Girdiğiniz sayı eksik sayı değildir.");}
    }

}






