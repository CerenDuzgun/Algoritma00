import java.util.Scanner;
public class project_6_92 {

    /*2^n *  (2^(n+1)-1) sayısının (2^(n+1)-1) kısmı asal sayı ise 
      a   *    b         mükemmel sayıdır.
    */
      
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n=input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            boolean asalmi=true;
            int a = (int)  Math.pow(2,i);//2^n
            int b = (int) (Math.pow(2,(i+1))-1);//2^(n+1)-1=b
            for (int bolen = 2; bolen <b; bolen++) {
                if(b%bolen==0){
                    asalmi=false;//b sayısının böleni varsa asal değildir.
                }
               
            }
            if (asalmi==true) {//asal ise
              System.out.println(a*b);
            }
        }
    }

}






