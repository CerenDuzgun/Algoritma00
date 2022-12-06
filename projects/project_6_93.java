import java.util.Scanner;
public class project_6_93 {

    /*Cullen sayıları n*2^n+1 şeklinde yazılan sayılara denir.
      Girien terim sayısı(n) kadar Cullen sayısı yazdıran program.
    */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in) ;
       int terim=input.nextInt();
        for (int n = 1; n <=terim; n++) {
            System.out.println(n*(Math.pow(2, n))+1);//n*2^n+1 sayısını yazdırır.
        }
    }

}






