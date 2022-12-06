import java.util.Scanner;
public class project_6_83 {

    //Bir doğrunun altın orana göre bölünmesi.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double ab=input.nextDouble();
        double cb=(2*ab)/(1+Math.sqrt(5));
        double ac= ab-cb;
        System.out.println("|AC|="+ac+"   |CB|="+cb);
    }

}






