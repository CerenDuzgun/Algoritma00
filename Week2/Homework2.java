
import java.util.Scanner;

public class Homework2 {
    
    //Girilen bir açının radyan ve gradyan cinsinden değerini yazdıran program.
    public static void main(String[] args) {
     Scanner input= new Scanner (System.in);
     System.out.println("Lütfen bir açı değeri giriniz.");
     double açı=input.nextDouble();
     double radyan= (açı*3.14)/180;
     double gradyan= (açı*200)/180;
     System.out.println("radyan cinsinden değeri="  + radyan);
     System.out.println("gradyan cinsinden değeri=" +gradyan);
    }
    
}
