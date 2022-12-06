import java.util.Scanner;
public class project_6_110 {

    /* Klavyeden girilen terim sayısı kadar kare üçgensel sayı yazdıran program.
       karesel sayı formülü :n^2  üçgensel sayı formülü: (n*(n+1))/2
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int terim=input.nextInt();
        double t=0;
        for (double n = 1; t <terim;n++ ) {
           double  us=(n*(n+1))/2;
           double sayi=Math.sqrt(us);// Üçgensel sayının karekökü
            if (sayi==Math.round(sayi)) {//bir tamsayı ise yuvarlanmış hali kendisine eşittir.
                System.out.println(us);
             t++;//Kare üçgensel sayı yazıldığında bir arttır.
            }
        }
    }

}






