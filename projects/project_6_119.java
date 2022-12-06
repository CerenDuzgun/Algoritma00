import java.util.Scanner;
public class project_6_119 {

    //Floyd üçgeni
    /*   1
         2  3
         4  5  6   arada bir tablık boşluk olacak.
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }

}






