import java.util.Scanner;
public class project_6_98 {

    /* 100 ile 999 arasındaki Armstrong sayılarını listeleyen program.
       N haneli bir sayının basamaklarının n'inci üstlerinin toplamı, 
       sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
       (4^3)+ (0^3)+(7^3) = 64+0+343 = 407  407 sayısı bir armstrong sayısıdır.
    */
    public static void main(String[] args) { // üç haneli sayılar istendiğinden 
        Scanner input=  new Scanner(System.in);
        for (int i = 1; i <=9; i++) {// yüzler asamağı için i
            for (int j = 0; j <=9; j++) {// onlar basamağı  için j
                for (int k = 0; k <=9; k++) { // birler basamağı için k 
                    int sayi=i*100+j*10+k ;
                    if (sayi== Math.pow(i,3) + Math.pow(j,3)+ Math.pow(k,3) ) {
                        System.out.println(sayi);
                    }
                }
            }
        }
    }

}






