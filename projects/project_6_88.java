import java.util.Scanner;
public class project_6_88 {

    //Girilen sayının asal çarpanlarını bulup yazdıran program.
    
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      int sayi=input.nextInt();
     
        for (int bolen = 2; bolen <=sayi; bolen++) { 
            boolean asalmi=true;
            if (sayi%bolen==0 && bolen==2) { // Girilen sayının 2'ye bölünüp bölünmediğine bakılır.
                System.out.println("2");     // En küçük asal 2 olduğundan 2'ye bölünüyorsa ekrana 2 yazdırılır.
               
            }
             /*Diğer bölenler için bölen sayının, asal sayı olup olmadığını bulmak için 1 ve kendisi hariç
            böleninin olup olmadığına bakılır. 2 sayısınında bu işlemi yapamayacağımız için yukarıda bölünüp bölünmediğini
            kontrol ettik.
            */
             else if (sayi%bolen==0 && bolen!=2) {   
                for (int bb = 2; bb < bolen; bb++) {
                    if (bolen%bb==0) {
                      asalmi=false; //Eğer ki bölen asal olma şartını sağlamazsa asalmi değişkenine "false" değerini atar.
                      break;
                    }
                    
                    }
                 if (asalmi==true) { //Eğer ki asalmi "true" değerinde kalmışsa bölen, asal olma koşulunu sağlıyor demektir.
                   System.out.println(bolen);
                }   
            }
          }
        }
    }
    

