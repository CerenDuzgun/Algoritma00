import java.util.Scanner;
public class project_6_70 {

    /* Klavyeden girilen terim(n)sayısına göre 
       sin(x) fonksiyonunu Maclaurin serisine göre hesaplayan program.
       sin(x)=∑((-1)^(k-1)*x^(2*k-1))/(2*k-1)! formülüyle(k=1'den n'e kadar)
       hesaplanır.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen açı derecesi giriniz.");
        int aci=input.nextInt();
        System.out.println("Lütfen n değerini giriniz.");
        int n=input.nextInt(); 
        double x=(aci*3.14)/180; //Dereceyi radyana çevirir.
        double sinx=0;
        for (int k = 1; k <=n; k++) {
            double faktoriyel=1;
            for (double i =1 ; i <= 2*k-1 ; i++) {
                faktoriyel=faktoriyel*i;          //Bu döngüde (2*k-1)! elde edilir.
            }
            
            sinx+=(double) (Math.pow(-1, k-1)* Math.pow(x,2*k-1))/faktoriyel;
            // Formüle göre 1'den e kadar olan değerleri toplarsak sin(x) değerini elde ederiz.
        }
         System.out.println("Seri açılımı ile hesaplanan değer."+sinx);
         System.out.println("Komutla hesaplanan değer."+Math.sin(x));
         // Maclaurin serisine göre bulduğumuz sin değerinin doğruluğuna bakmak için.
    }

}






