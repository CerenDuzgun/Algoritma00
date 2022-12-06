import java.util.Scanner;
public class project_6_74 {

   /* Klavyeden girlen x değeri için, klavyeden girilen terim sayısı kadar seriye
     açarak e^x değerini hesaplayan program.
     Formül: ∑ x^k/k! (k=0'dan n'e kadar)
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen n değerini giriniz.");
        int n=input.nextInt();//terim sayısı
        System.out.println("lütfen x değerini giriniz.");
        int x=input.nextInt();
        double faktoriyel=1;
        double toplam=1;// ilk eleman 1 olduğundan toplam değişkenine 1 atanır.
        for (int k = 1; k <=n-1; k++) {// n değerinden 1 çıkarttırılır.
            faktoriyel*=k;//k!
            toplam+= (double) Math.pow(x,k)/faktoriyel;//x^k/k! değerleri 1'den n-1'e kadar toplam
        }                                              // değişkeninde toplanır.
        System.out.println(toplam);
        
    }

}






