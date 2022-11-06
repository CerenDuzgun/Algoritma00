
import java.util.Scanner;
public class Homework3 {

        //sayi ile sayi2'yi çarpma operatorü kullanmadan çarpım sonucunu yazdıran program.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int sayi= input.nextInt();
        int sayi2= input.nextInt();
        int sayac=1;
        int toplam=0;
        while (sayac<=sayi){
            toplam=sayi2+toplam;
            sayac=sayac+1;   
        }
        System.out.println(toplam);
    }
    
}
