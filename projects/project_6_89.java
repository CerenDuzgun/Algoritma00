import java.util.Scanner;
public class project_6_89 {

    
    public static void main(String[] args) {
       //Girilen bir sayının Chen asalı olup olmadığını yazan program.
       
       Scanner input=new Scanner (System.in);
       int sayi=input.nextInt(); //Girilen sayıyı "sayi" değişkenine atayalım.
       
       /*Bir sayının Chen asalı olması için hem kendisinin hem de iki fazlasının 
       asal olması gerekir.
       */
       boolean asalmi=true;
          /*Girilen sayının asal olup olmadığını bulmak amacıyla 2'den başlayarak sayının kendisine kadar sayılara
           (kendisi hariç) bölünüp bölünmediğine bakılır. Eğer bölünüyorsa asalmi değişkenine "false" der ve
           dögüden çıkar.
           */
       for(int bolen=2; bolen<sayi; bolen++){ 
          if(sayi%bolen==0){
              System.out.println("Girdiğiniz sayı asal sayı değildir."); 
              asalmi =false;
              break;
            }
        }
       // asalmi değişkenine false atanmamışsa asal sayı demektir.
       
         if (asalmi==true){    //Bu durumda asal sayının 2 fazlasının asal olup olmadığına bakılır.
            for(int bolen=2; bolen<(sayi+2); bolen++){
                if((sayi+2)%bolen==0) {
                  System.out.println("Girdiğiniz sayı asal sayı olup Chen asalı değildir.");
                  //Eğer ki asal sayının 2 fazlasının 1 ve kendisi hariç böleni varsa yukarıdaki yazıyı yazdırır.
                  asalmi=false;
                  break;}
               
            }  
            /* Eğer ki asalmi değişkenine asal sayının 2 fazlası için false atanmamışsa, 1 ve kendisi hariç böleni
             böleni yoktur demektir. Bu durumda da Chen asalı olduğunu yazdırır.*/
            if (asalmi==true){
               System.out.println("Girdiğiniz sayı Chen asalıdır.");}
            }
            
       }
}
    
    

