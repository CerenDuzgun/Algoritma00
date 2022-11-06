
 import java.util.Scanner;
public class Homework4 {
    // n değerine göre n^2-5*n+3 fonksiyonun değerini -1,0 ve 1 olarak yazdıran program.
    // İşaret Fonksiyonu
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n= input.nextInt();
        int f = n*n - 5*n +3 ;
        if (f>0){
          System.out.println("1");}
        else if (f==0){
          System.out.println("0");
        }
        else if (f<0){
          System.out.println("-1");}
    }
    
}
