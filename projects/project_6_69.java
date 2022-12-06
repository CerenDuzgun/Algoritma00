import java.util.Scanner;
public class project_6_69 {

    /* cos(x) fonksiyonunu Maclaurin seirisine göre hesaplayan program.
       cos(x)=∑((-1)^k*x^(2*k))/(2*k)! formülüyle ( k=1 'den n'e kadar )
       hesaplanır.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen açı derecesi giriniz.");
        int aci=input.nextInt();
        System.out.println("Lütfen n değerini giriniz.");
        int n=input.nextInt();
        double cosx=0;
        double x=(aci*3.14)/180; //Dereceyi radyan cinsine çevirmek için.
        for (int k = 0; k <=n; k++) {
            double faktoriyel=1;
            for (double i =1 ; i <= 2*k ; i++) {
                faktoriyel=faktoriyel*i;          // Bu döngüde (2*k)! elde edilir.
            }
            
            cosx+=(double) (Math.pow(-1, k)* Math.pow(x,2*k))/faktoriyel;
        }   // Formüle göre 1'den e kadar olan değerleri toplarsak cos(x) değerini elde ederiz.
        
        System.out.println("Seri açılımı ile hesaplanan değer."+cosx);
        
        System.out.println("Komutla hesaplanan değer."+Math.cos(x)); 
        // Maclaurin serisine göre bulduğumuz cos değerinin doğruluğuna bakmak için.
    }

}






