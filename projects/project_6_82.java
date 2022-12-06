import java.util.Scanner;
public class project_6_82 {

    /* Klavyeden girilen bölüm sayısına göre kök 5 değerini hesaplayan program.
       Formül: 2+1/(4+1/t) ,  t=toplam    

    */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double n =input.nextDouble();//bölüm sayısı
        double t=1;
        for (int i = 1; i < n; i++) {
            t=4+1/t;
        }
        System.out.println("kök 5 değeri:"+(2+1/t));
    }

}






