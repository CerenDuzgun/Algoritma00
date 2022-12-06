import java.util.Scanner;
public class project_6_97 {

    // Girilen iki sayının dost sayılar olup olmadığını yadıran program.
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int m=input.nextInt();
       int n=input.nextInt();
       int mtt=0;
       int ntt=0;
        for (int bolen = 1; bolen <m; bolen++) { // Girilen m sayısının m hariç pozitif tamsayı bölenlerinin
                                                 // toplamı (mtt) bulunur.
            if (m%bolen==0) {
                mtt+=bolen;
            }
        }
        for (int bolen = 1; bolen <n; bolen++) { // Girilen n sayısının n hariç pozitif tamsayı bölenlerinin
            if (n%bolen==0) {                    // toplamı (ntt) bulunur.
                ntt+=bolen;
            }
        }
        if (mtt==n && ntt==m) {
            /* Eğer ki m'nin kendisi hariç pozitif tamsayı bölenlerinin toplamı n'ye eşit ve n'nin de kendisi hariç
            pozitif tamsayı bölenlerinin toplamı m'ye eşitse, m ve n sayılarının dost sayılar olduğunu yazdırır. Aksi takdirde
            dost sayılar olmadığını yazdırır.
            */
           System.out.println(m+" ve "+n+" dost sayılardır.");
        }
        else{
           System.out.println(m+" ve "+n+" dost sayılar değiller. ");
        }
    }
    
}
