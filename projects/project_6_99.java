import java.util.Scanner;
public class project_6_99 {

   /* Klavyeden girilen iki sayının bağdaşık sayı olup olmadığını yazdıran program.
 
    Bağdaşık sayılar: İki basamaklı iki doğal sayının onlar basamağında aynı rakam varsa ve
    bu sayıların birler basamağındaki rakamların toplamı 10 ediyorsa bu sayılara 
    bağdaşık sayılar denir.*/
    
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int a =input.nextInt();
     int b=input.nextInt();
     
     int abb = a%10; // a sayısının birler basamağındaki rakamı abb adlı değişkene atar.
     int aob = a/10; // a sayısının onlar basamağındaki rakamı aob adlı değişkene atar.
     int bbb = b%10;
     int bob = b/10;
     
        /* Bağdaşık sayı olma koşulu sağlanıyorsa "a ve b sayıları bağdaşık sayılardır." 
        yazdırır.*/
     if (aob==bob && abb+bbb==10) {
            System.out.println(a+"  ve  "+b+"  sayıları bağdaşık sayılardır.");
        }
     else{
            System.out.println(a+"  ve  "+b+"  sayıları bağdaşık sayılar değiller.");}
    }

}






