import java.util.Scanner;
public class project_6_120 {

    //pisagor üçlemesi
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
        for (int a = 1; a <=n-1; a++) {
            for (int b = a+1; b <=n-a; b++) {
              int c =n-(a+b);
                if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c, 2)) {
                    System.out.println("a:"+a+"  b:"+b+"  c:"+c);
                }
            }
        }
    }

}






