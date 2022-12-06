import java.util.Scanner;
public class project_6_117 {

    /*Klavyeden girilen terim sayısı kadar Pell sayısı yazdıran program.
      Pell sayıları:0,1,2,5,12,29,70,169,408,...
      Kapalı formül: ((1+2^0.5)^k-(1-2^0.5)^k)/(2*2^0.5)
      (k=0'dan n'e kadar)
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int terim=input.nextInt();
        
        for (int k= 0; k<terim; k++) {
            System.out.println(Math.round(( Math.pow(1+Math.pow(2,0.5),k) - Math.pow(1-Math.pow(2,0.5),k)  ) /  (2*Math.pow(2,0.5))) );
           //Sonucun tam sayı çıkması için (Math.round()) yuvarladık.
        }
        
    }

}






