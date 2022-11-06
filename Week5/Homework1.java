import java.util.Scanner;
public class Homework1 {

   /*     ******
          *****
          ****       Girilen satır sayısına göre azalan yapıda şekil oluşturan program.
          ***
          **
          *    
    */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int sa= input.nextInt();
         for (int i =sa ; i>0 ;i--){
            for (int j =i ; j>0; j--){
                System.out.print("*");  }
          System.out.println();} 
    }
    
}
