import java.util.Scanner;
public class project_6_113 {

    /* Terim sayısı kadar Fibonacci asal sayısı yazdıran program.
       Kendinden önceki iki sayının toplamı olan sayılara Fibonacci sayıları denir.
    */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
           int terim= input.nextInt();
           int s1=1;
           int s2=2;
           int t=0;
           boolean asalmi=true;
           System.out.println("2");
           
           while ( t <terim) {  //Fibonacci sayıları bulunur.
             int sayi=s1+s2;
           
             s1=s2;
             s2=sayi;
             for (int bolen= 2; bolen < sayi; bolen++) { //asal olup olmadığına bakılır.
                   if (sayi%bolen==0) {
                       asalmi=false;
                   }
            }
            if (asalmi==true) {//böleni yoksa asalmi değişkeni true değerinde kalmışsa
                System.out.println(sayi);//sayı yazdırılır.
                t++;
               }
            asalmi=true;
 
       
            
        }
    }

}






