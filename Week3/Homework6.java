
import java.util.Scanner;
public class Homework6 {
     
     // n sayısına göre haftanın gününü yazdıran program.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        if(n==1){
           System.out.println("pazartesi");}
        else if (n==2){
           System.out.println("salı");}
        else if (n==3){
           System.out.println("çarşamba");}
        else if (n==4){
           System.out.println("perşembe");}
        else if (n==5){
           System.out.println("cuma");}
        else if (n==6){
           System.out.println("cumartesi");}
        else if (n==7){
           System.out.println("pazar");}
        else 
           {System.out.println("Lütfen geçerli bir sayı girin.");}
    }
    
}
