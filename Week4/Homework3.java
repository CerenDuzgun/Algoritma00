
 import java.util.Scanner;
 
public class Homework3 {

    // n sayısının r'li kombinasyonlarının sayısını bulan program.
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
    int n=input.nextInt();
    int r=input.nextInt();
    int a=1;
    int b=1;
    int c=1;
    int sayac=1;
    while (sayac<=n){
       a*=sayac;     //n!
       sayac+=1;
    }
    
    sayac=1;
    
    while (sayac<=r){
       b*=sayac;        //r!
       sayac+=1;}
       sayac=1;
       
    while (sayac<=(n-r)){
       c*=sayac;           //(n-r)!
       sayac+=1;}
    
    System.out.println("sonuç="+a/(b*c));
    }
}
