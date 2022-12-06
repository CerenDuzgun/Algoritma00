import java.util.Scanner;
public class project_6_91 {

    /*Klavyeden girilen bir tamsayının mükemmel sayı olup olmadığını yazdıran program.
      Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara
      mükemmel sayı denir.
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int bolen_toplami=0;
        int sayi =input.nextInt();
        for (int bolen = 1; bolen < sayi; bolen++) { //Girilen sayının bölenleri bulunur ve
                                                     // bolen_toplami değişkeninde toplanır.
            if (sayi%bolen==0) {
               bolen_toplami+=bolen;
            }
        }
        if (sayi == bolen_toplami) {// Bölenlerinin toplamı sayıya eşitse
           System.out.println("Girdiğiniz sayı bir mükemmel sayıdır.");
        }
        else{
           System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");
        }
    }

}






