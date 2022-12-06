import java.util.Scanner; 
public class project_6_73 {

    // Büyük harf tahmin etme programı.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
        int t_sayi=0;//Tahmin sayısını ifade eder.
        
        int ascii= (int)(Math.random()*65)+25;//65 ile 95 aralığında rastgele bir sayı oluşturur.
        char harf= (char) ascii;//Oluşturulan sayıyı  büyük harfe çevirir.
        for (int i = 1; i <= 10; i++) {
            
             System.out.println("Lütfen bir büyük harf giriniz.");
             char tahmin=input.next().charAt(0);//Girilen harf okunup tahmin değişkenine atanır.
             
             if(tahmin==harf){  //Tahmin ile harf uyuşuyorsa döngüden çıkar.
                  System.out.println(i+" tahminde buldunuz."); 
                  break;
              }
            if (i==10) { //Aksi takdirde 10 deneme hakkınız bittiğinde döngü sona erer.
                System.out.println("10 deneme hakkınız bitti. Harf:"+harf);
            }
        }
        
        
    }

}






