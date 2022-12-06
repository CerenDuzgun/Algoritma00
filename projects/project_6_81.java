import java.util.Scanner;
public class project_6_81 {

    /* Klavyeden girilen bölüm sayısına göre kök 3 değerini hesaplayan program.
       kök 3  değeri 1+1/(2+1/n) sonsuz kesriyle hesaplanabilir.
    */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in); 
         double n =input.nextDouble();//bölüm sayısı
         double t=1;
         for (int i = 1; i <n-1; i++) {
            t=1+1/(2+1/t);
        }
         System.out.println("kök 3 değeri:"+(1+1/t));
    }

}






