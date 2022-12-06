
public class project_6_104 {

    /*1'den 50'ye kadar Markov sayılarını listeyen program.
     Markov sayıları x^2+y^2+z^2=3*x*y*z Markov denkleminin pozitif tam sayı olan
     x,y ve z şeklindeki çözümleridir.
    */
    public static void main(String[] args) {
        for (int x = 1; x <=50; x++) { // 1-50 aralığında x
            for (int y = 1; y <=50; y++) { // 1-50 aralığında y
                for (int z = 1; z <=50; z++) { // 1-50 aralığında z
                    if (x*x+y*y+z*z==3*x*y*z) {
                        System.out.println("(x,y,z):"+x+","+y+","+z);
                    }
                }
            }
        }
    }

}






