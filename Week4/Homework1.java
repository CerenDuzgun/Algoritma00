
import java.util.Scanner;
public class Homework1 {
    // n sayısının pozitif bölenlerini yazdıran program.
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n =input.nextInt();
   
    for (int s=1;s<=n;s++){
      if (n%s==0){
        System.out.println(s);}
    }
   
    
}
}