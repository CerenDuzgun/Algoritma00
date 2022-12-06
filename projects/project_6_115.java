import java.util.Scanner;
public class project_6_115 {

    /* Klavyeden girilen n değerine göre Tribonacci sayılarını yazdıran program.
       Kendisinden önceki üç sayının toplamına eşit olan sayılara Tribonacci sayıları denir.
       Tribonacci sayıları: 1,1,2,4,7,13,24,44... terim sayısı (n)>=3 için.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int terim=input.nextInt();
        int f1=1;
        int f2=1;
        int f3=2;
       System.out.print("1,1,2,");//ilk 3 sayı  yazdırılır.
        for (int i = 1; i <=terim-3; i++) {// terim sayısından 3 çıkartılır.
            int f4=f1+f2+f3;
            System.out.print(f4+",");
            f1=f2;// Bir sonraki sayı için her sayı bir  öncekine atanır.
            f2=f3;
            f3=f4;
        }
              
    }

}






