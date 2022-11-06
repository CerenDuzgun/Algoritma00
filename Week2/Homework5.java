
import java.util.Scanner;
public class Homework5 {

    //Direnç ve akım değeri ile gerilim Hesaplama
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("lütfen bir direnç değeri giriniz.");
       Double direnc= input.nextDouble();
       System.out.println("lütfen akım değeri giriniz.");
       Double akım= input.nextDouble();
       Double gerilim= akım*direnc;
       System.out.println("gerilim="+ gerilim);
    }
    
}
