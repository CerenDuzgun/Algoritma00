import java.util.Scanner;
public class project_6_111 {

    /* Klavyeden girilen terim sayısı kadar Fibonacci sayısı yazdıran program.
       Kendisinden önceki iki sayının toplamına eşit olan sayılara Fibonacci sayısı denir.
       0,1,2,3,5,8,13,21.....
    */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int terim= input.nextInt();
        int s1=0;
        int s2=1;
        System.out.println("1");
        for (int t = 2; t <=terim; t++) {
          int sson=s1+s2;//1. sayı ve 2.sayı 3.'ye eşit
            System.out.println(sson);
            s1=s2;//Bir sonraki sayı için 2.sayı 1.'ye
            s2=sson;//3. sayı 2.'ye atanır.
       
            
        }
    }

}






