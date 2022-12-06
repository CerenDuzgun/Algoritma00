
public class project_6_87 {

    // Her iki basamağı da asal sayı olan iki basamaklı pozitif sayıları listeleyen program.
    public static void main(String[] args) {
        for (int i = 2; i <= 7; i++) {//Onlar basamağı için 2'den 7'ye kadar asal sayılar 10 ile çarpılarak,
            for (int j = 2; j <=7; j++) {//Birler basamağı için 2'den 7'ye kadar asal sayılarla toplanır.
                if ((i==2 ||i==3 ||i==5 ||i==7) && (j==2 ||j==3 ||j==5 ||j==7) ) {
                   System.out.println(10*i+j);
                }
            }
        }
    }

}






