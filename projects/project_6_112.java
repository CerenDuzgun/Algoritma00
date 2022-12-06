import java.util.Scanner;
public class project_6_112 {

    /* 0 ile 99 arası basamakları toplamı Fibonacci sayısı olan sayıları yazdıran program;
       Fibonacci sayıları:0,1,1,2,3,5,8,...
    */
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam;
        for (int sayi = 0; sayi < 10; sayi++) {// tek basamaklı sayılar için 
          if (sayi==1 || sayi==2|| sayi==3||sayi==5 ||sayi==8 ) {
                System.out.println(sayi);  
            }
        }
        for (int sayi = 10; sayi <=99 ; sayi++) {
            toplam=0;// her farklı sayı için farklı toplam olması için 0'a eşitlenmeli
            toplam+=sayi%10+sayi/10;
                 //birler  + onlar basamağı
            if (toplam==1 || toplam==2|| toplam==3||toplam==5 ||toplam==8|| toplam==13 ) {
                System.out.println(sayi);
            }
        }
    }

}






