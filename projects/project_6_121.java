import java.util.Scanner;
public class project_6_121 {

    /*Dobinski formülü
    
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       double e= Math.exp(1);// e^1 değeri için.
       double faktoriyel=1;
       double toplam=0;
        for (int k = 1; k <=n; k++) {
            faktoriyel*=k;
            toplam+=Math.pow(k,n)/faktoriyel;
        }
        System.out.println(toplam/e);
        
    }

}






