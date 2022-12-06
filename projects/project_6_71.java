import java.util.Scanner;
public class project_6_71 {

   /*Klavyeden girilen terim sayısına göre Ln(2) değerini hesaplayıp
     yazdıran program.
    Ln(2)=1/2 +1/12 +1/30...
    */

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen terim sayısı giriniz");
        int n=input.nextInt();                   //Payda kısımları 1*2, 3*4, 5*6
        double j=2;                              // şeklinde gittiği için, i ve j değişkenleri için
        double toplam=0;                         // 1 ve 2 değerlerini atayıp, ikişer arttırsak payda
        for (double i = 1 ; i <=n; i+=2) {       // kısımlarını elde edebilirz
            toplam+= (double)1/(i*j);
            j+=2;
        }
        System.out.println(toplam);
    }

}






