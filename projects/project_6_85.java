import java.util.Scanner;
public class project_6_85 {

    /*Bir doğru parçasının gümüş orana göre bölünmesi. Gümüş oran:1+2^0.5
     Doğru gümüş orana göre 2 parçaya ayrılacaksa (2*a+b)/a=1+2^0.5 eşitliği kullanılır.
     u:doğru uzunluğu    a=u/2^0.5
     Klavyeden girilen doğru parçasını gümüş orana göre bölerek yazdıran  program.
    */
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double u=input.nextInt();
        double a=u/Math.sqrt(2);
        double b=u-a;
        System.out.println("Doğru parçalarının uzunlukları:"+a+" , "+b);
    }

}






