import java.util.Scanner;
public class project_6_84 {

    /* Uzun kenarları eşit ve bu kenarlardan birinin kısa kenara oranıaltın orana eşit ise
    bu üçgene altın üçgen denir. Klavyeden kısa kenarı girilen altın üçgenin kenar uzunluklarını 
    yazdıran program.
     uzun kenar/kısa kenar=(1+kök5)/2 ise altın üçgendir.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kisa=input.nextInt();
        double uzun= kisa*(1+Math.sqrt(5))/2;
        System.out.println("Altın üçgenin kenar uzunlukları:"+kisa+","+uzun+","+uzun);
    }

}






