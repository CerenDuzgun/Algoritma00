import java.util.Scanner;
public class project_6_116 {

   /* Klavyeden girilen Fibonacci sayısına göre bir önceki ve bir sonraki fibonacci sayısını
      yazdıran program.
      Fibonacci sayıları kendisinden önceki iki sayının toplamı olan sayılardır.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int f2=input.nextInt();
        double sayi=(1+Math.pow(5,0.5))/2;//(1+kök 5)/2
        int f1=(int)Math.round(f2/sayi);//Bir önceki için.(Tamsayı çıkması için Math.round())
        int f3=(int)Math.round(f2*sayi);//Bir sonraki için.
        
        System.out.println("Önceki Fibonacci sayısı:"+f1);
        System.out.println("Sonraki Fibonacci sayısı:"+f3);
    }

}






