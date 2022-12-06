import java.util.Scanner;
public class project_6_77 {

   /* Madhava of Sangamagrama serisiyle girilen terim sayısına göre pi sayısını hesaplayıp
      yazdıran program.(k =0'dan n-1'e kadar) ∑ (-1)^k/((2*k+1)*3^k)
   */  
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n =input.nextDouble();//terim sayısı
        double t=0;
        for (int k = 0; k <=n-1; k++) {
         t=t+( Math.pow(-1,k)/( (2*k+1)*(Math.pow(3, k) ) ) );//(-1)^k/((2*k+1)*3^k)değerleri toplam
        }                                                     // değişkeninde toplanır.
        System.out.println((Math.sqrt(12))*t);
    }

}






