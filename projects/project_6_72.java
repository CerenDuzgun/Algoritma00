import java.util.Scanner;
public class project_6_72 {

    //Sayı tahmin etme programı.
    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int r=(int) (Math.random()*98)+1;//1 ile 99 aralağında rastgele bir sayı oluşturur.
        int t_sayi=0; //tahmin sayısını ifade eder.
        int tahmin;
        do {
            System.out.println("Tahmininizi giriniz.");
            tahmin=input.nextInt();
            if (tahmin<r) {
                System.out.println("Lütfen daha büyük bir sayı giriniz.");
            }
            if (tahmin>r) {
                System.out.println("Lütfen daha küçük bir sayı giriniz.");
            }
            
            t_sayi++;// Her tahmin sonunda tahmin sayısı arttırlır.
            
        } while (tahmin!=r);//Rastgele sayı bulunamayana kadar döngü devam eder.
        
         System.out.println(t_sayi+" tahminde buldunuz."); 
          //Bulunduğunda kaç tahminde bulduğunuz yazdırılır.
    }

}






