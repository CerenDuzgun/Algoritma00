
import java.util.Scanner;
public class Homework6 {

   //Vücut kitle endeksi hesaplama
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("kg değeri giriniz.");
       Double kg= input.nextDouble();
       System.out.println("lütfen boyunuzu giriniz");
       Double boy= input.nextDouble();
       Double indeks= kg/(boy*boy);
       System.out.println("Vücut kitle indeksi"+ indeks);
    }
    
}
