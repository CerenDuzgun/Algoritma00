import java.util.Scanner;
public class project_6_114 {

    /* Negafibonacci sayıları Fibonacci sayılarının negatif indisli elemanlarıdır.
       İlk sekiz Fibonacci sayısı: 1,-1,2,-3,5,-8,13,-21
       Klavyeden girilen terim sayısına göre Fibonacci sayılarını yadıran program.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int f1=1;
        int f2=-1;
        
        System.out.print(f1+","+f2+",");
        for (int i = 1; i <=n-2; i++) {// ilk iki terimi yazdırdığımızdan n-2terim kalır.
          int  f3=f1-f2;
          //2.sayıyı 1. sayıdan çıkarırsak 1 eksili, 1 artılı Fibonacci sayıları elde etmiş oluruz.
            System.out.print(f3+",");
            f1=f2;//Bir sonraki sayı için 1.sayıyı 2. sayıya 
            f2=f3;//2.sayıyı 3.sayıya eşitleriz.
        }
        
    }

}






