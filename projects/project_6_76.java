import java.util.Scanner;
public class project_6_76 {

    /* Klavyeden girilen terim sayısına göre e değerini Brothers formülü ile
      hesaplayan program. Brothers formülü:   ∑ 2*k+2/(2*k+1)! (k=0'dan n'e kadar)
    */
     
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();//terim sayısı
        double toplam=0;
       
        for (int k= 0; k <=n; k++) {
           double faktoriyel=1; 
        //Faktoriyel değerinin her k değeri için doğru hesaplanması için faktoriyel değişkenine 1 atanmalı.
            for (int i = 1; i <=2*k+1; i++) { 
                                              //(2*k+1)!
                faktoriyel*=i;
            }
            
            
            toplam+=(double)(2*k+2)/faktoriyel;//2*k+2/(2*k+1)! değerleri toplam değişkeninde toplanılır.
        }
        System.out.println(toplam);
    }

}






