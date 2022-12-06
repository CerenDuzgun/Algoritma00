import java.util.Scanner;
public class project_6_94 {

    /* Klavyeden girilen terim sayısı kadar Fermat sayısı yazdıran program.
       Fermat sayıları 2^(2^n)+1 şeklinde yazılabilen sayılara denir.*/
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in) ;
         int terim=input.nextInt();
         for (int n = 1; n <=terim; n++) {
          double üs= Math.pow(2, n); //2^n 'i verir.
          System.out.println(Math.pow(2, üs)+1); // 2*(2^n)+1 sayısını yazdırır.
        }
    }

}






