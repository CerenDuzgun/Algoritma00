import java.util.Scanner;
public class project_6_78 {

    /* john Wallis ardışık çarpımıyla klavyeden girilen terim sayısı kadar çarpım yaparak
       pi sayısını  hesaplayıp yazdıran  program. formül: (4*k*k)/(4*k*k-1) sıra sıra k değerleri için
       aynı  değişkende  çarpılacak. Çarpım sonucu pi/2 değerini verdiğinden çarpım 
       2 ile çarpılacak.
    */
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
         double n =input.nextDouble();//terim sayısı
         double c =1;//çarpım değişkenini ifade eder.
         for (double k = 1; k <=n; k++) {
              double c1= 4*k*k;//geçici çarpım
              c = c*c1/(c1-1);
        }
         System.out.println(2*c);
    }

}






