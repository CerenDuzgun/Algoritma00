import java.util.Scanner;
public class project_6_102 {

   /*Klavyeden girilen sayı kadar heterometrik sayı yazdıran program.
    Heterometrik sayılar a*(a+1) şeklinde yazılabilen sayılardır.*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        for (int a = 1; a <=sayi ; a++) {
            System.out.println(a*(a+1));
        }
    }

}






