
import java.util.Scanner;
public class Homework2 {

    /* 1'den n'e kadar olan ; sayıların toplamı(t1), çift sayıların toplamı(t2)
     ve tek sayıların toplamını (t3) yazdıran program.*/
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
        int t1=0;
        int t2=0;
        int t3=0;
        int s =1;
        while(s<=n)
         {
            t1=t1+s;
         
            if (s%2==0){
            t2=t2+s;}
         
            else {t3=t3+s;}
         
             s=s+1;
         }
         System.out.println("t1="+t1);
         System.out.println("t2="+t2);
         System.out.println("t3="+t3);
        
    }
    
}
