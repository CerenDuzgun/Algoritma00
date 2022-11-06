import java.util.Scanner;
public class Homework2 {
    
    //Girilen sayı=3*a+5*b eşitliğini sağlayan a ve b sayılarını yazdıran program.
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int sayi=input.nextInt();
      int a ,b;
      
        for (a = 1; a <= sayi; a++) {
            for (b=1; b < sayi; b++) {
                if(sayi==3*a+5*b){
                System.out.println("a sayısı"  +a+ "b sayısı"+b +"olabilir");}
            }
        }
    }
    
}
