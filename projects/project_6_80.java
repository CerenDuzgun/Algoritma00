import java.util.Scanner;
public class project_6_80 {

    /*Klavyeden girilen bölüm sayısına göre kök 2 değeri hesaplayan program.
      kök 2 2+1/n sonsuz kesriyle hesaplanabilir.
    */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        double n =input.nextDouble();// bölüm sayısı
        double t=1;
        for (int i = 0; i < n; i++) {
            t=2+1/t;
        }
        System.out.println("kök 2 değeri:"+(1+1/t));
    }

}






