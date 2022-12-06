import java.util.Scanner;
public class project_6_107 {

   //Klavyeden girilen n basamak sayısına göre Palindrom sayıların toplamını yazdıran program.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Toplam:"+Math.pow(9*10,(n-1)/2));//9*10^((n-1)/2)
    }

}






