
 import java.util.Scanner;
public class Homework5 {
    // n metre değerini diğer uzunluk birimlerine dönüştüren program.
    public static void main(String[] args) {
     Scanner input= new Scanner (System.in);
     Double n=input.nextDouble();
     System.out.println("mm için 1,cm için 2,dm için 3, km için 4 değerini giriniz.");
     double deger=input.nextDouble();
     if (deger==1){
         n=n*1000;
     }
     else if (deger==2){
       n=n*100;}
     else if (deger==3){
       n=n*10;}
     else if (deger==4){
       n=n/1000;}
     System.out.println(n);
    }
    
}
