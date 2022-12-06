import java.util.Scanner;
public class project_6_86 {

    // Klavyeden girilen üst sınıra kadar olan asal sayıları yazdıran program.
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);  
      int sinir= input.nextInt();

        if (sinir >= 2) {// 2  döngüye dahil edilemeyeceğinden yazdırılır
          System.out.println("2");
        }
        
        for (int sayi = 3; sayi <=sinir ; sayi++) { 
            boolean asalmi=true;
             
                
                  for (int bolen = 2; bolen < sayi; bolen++) {
                         if (sayi%bolen==0) {
                            asalmi=false;
                         }
                     
                     //sayının  kendisi ve 1 hariç böleni yoksa yani asalmi hala true değerinde ise
                     if (asalmi==true) {
                         System.out.println(sayi);//sayıyı yazdır.
                     }
            }
        }
    }

}






