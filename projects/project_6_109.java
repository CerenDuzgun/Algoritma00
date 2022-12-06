import java.util.Scanner;
public class project_6_109 {

    /*Klavyeden girilen terim sayısı kadar üçgensel sayı yazdıran program.Bir üçgensel sayı,
      1'den ne kadar olan n doğal sayının toplamıdır. Bu sayılara üçgensel denmesinin sebebi, 
      bir üçgen şeklinde dizilebilecek eşit çaplı topların sayılarına karşılık gelmeleridir.
      Formülü: (n*(n+1))/2 
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int terim=input.nextInt();
        for (int n = 1; n <=terim; n++) {
            System.out.println((n*(n+1))/2);
        }
    }

}






