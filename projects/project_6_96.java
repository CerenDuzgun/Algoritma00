import java.util.Scanner;
public class project_6_96 {

    /*Klavyeden girilen bir sayının Hilbert sayısı olup olmadığını yazdıran program.
      4*k+1 şeklinde ifade edilebilen sayılara Hilbert sayıları denir.
    */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in) ;
        int sayi=input.nextInt();
        if ((sayi-1)%4==0) { //Hilert sayısı olması için 1 eksiğini 4'e böldüğünde kalansız bölünmeli.
           System.out.println(sayi+"  bir Hilbert sayısıdır.");
        }
        else{
           System.out.println(sayi+ "  Hilbert sayısı değildir.");
        }
    }

}






