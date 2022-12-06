import java.util.Scanner;
public class project_6_75 {

    /*Klavyeden girilen x ve n değerine göre binom açılımı kullanılarak
      e^x değeri hesaplayıp yazdıran program.
      formül: (1+x/n)^n
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double x=input.nextDouble();
        double n =input.nextDouble();//terim sayısı
        double sonuc= Math.pow((1+x/n), n);
        System.out.println(sonuc);
    }

}






