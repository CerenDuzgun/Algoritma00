import java.util.Scanner;
public class project_6_103 {

    /*Klavyeden girilen pozitif bir tamsayının Ore sayısı olup olmadığını test eden program.
     Bir pozitif tam sayının, tam bölenlerinin harmonik ortalaması tam sayı ise bu sayıya ore sayısı 
     denir.  Örneğin   28 sayısı için     6/(1 + 1/2 + 1/4 + 1/7 + 1/14 +1/28)=3  olduğundan                  
     28 bir Ore sayısıdır.
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       int sayi= input.nextInt();
       double toplam=0;
       double bolen_s=0;// bölen sayısını ifade eder.
        for (double bolen = 1; bolen <=sayi; bolen++) {
            if (sayi%bolen==0) {
                toplam+=1/bolen;// 1/bölen toplamları için.
                bolen_s+=1;     
            }
        }
        double sonuc= (double)bolen_s/toplam;// Sonuç ondalıklı çıkabileceği için double.
        if (Math.round(sonuc)==sonuc) {//Bir sayının yuvarlanmış hali kendisine eşitse tam sayıdır.
            System.out.println(sayi+" bir  Ore sayısıdır.");}
        else {
            System.out.println(sayi+"  bir Ore sayısı değildir.");
        }
       
       
    }

}






