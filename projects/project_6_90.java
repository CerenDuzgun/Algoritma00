import java.util.Scanner;
public class project_6_90 {

    /*İkiz asallar, aralarındaki fark 2 olan asal sayılardır.
       Örneğin 3-5, 5-7, 11-13 ikiz asallardır. 
       Klavyeden girilen sınıra kadar  olan ikiz asalları listeleyen program.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sinir=input.nextInt();
        
        for (int i = 3; i <=sinir; i++) {              //2 dahil olmadığından 3'ten  başlanarak 
            boolean asalmi=true;                       // sınır sayısına kadar asal sayılar bulunur.
            for (int bolen = 2; bolen <i; bolen++) {   
                if (i%bolen==0) {
                    asalmi=false;
                }
            }
            if (asalmi==true){ //sayının  kendisi ve 1 hariç böleni yoksa yani asalmi hala true değerinde ise
                for (int bolen2 = 2; bolen2 <i+2; bolen2++) {//2 fazlasının da asal olup olmadığına bakılır.
                    if ((i+2)%bolen2==0) {
                        asalmi=false;
                    }
                }
                if (asalmi==true) {//asalsa eğer yazdırılır.
                    System.out.println(i+" ve "+(i+2)+" ikiz asal sayılardır.");
                }
            }
            
        }
    }

}






