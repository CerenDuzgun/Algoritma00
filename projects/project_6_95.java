import java.util.Scanner;
public class project_6_95 {

    /*1'den büyük x ve y tam sayıları için x^y + y^x biçimindeki sayılara Leyland sayısı denir.
      Klavyeden girilen x ve y sayıları için mümkün olan tüm Leyland sayılarını yazdıran program.
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in) ;
        int x=input.nextInt();
        int y=input.nextInt();
        for (int i = 2; i <=x; i++) {
            for (int j = 2; j <=y; j++) {
                System.out.println( (Math.pow(i,j)) +  (Math.pow(j,i))  );
            }                   //     x^y          +      y^x
        }
        
    }

}






