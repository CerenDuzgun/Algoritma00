import java.util.Scanner;
public class Homework7 {
    //Girilen sayının tersten yazılmış sayısal değerini yazdıran program.
    
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      int sayi=input.nextInt();
      int tersi=0;
      
      while(sayi>0){
       int kalan=sayi%10;
       tersi= tersi*10;
       tersi=tersi+kalan;
       sayi=sayi/10;
     
      }
        System.out.println(tersi);
    }
    
}
