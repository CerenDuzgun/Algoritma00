
public class project_6_106 {

    /*Baştan ve sondan yazılışları ve okunuşları aynı olan tam sayılara "palindrom sayılar" denir.
      100 ile 9999 arasındaki palindrom sayıları yazdıran program.
    */    
    public static void main(String[] args) {
      
        
        for (int i = 1; i <=9; i++) { //Üç basamaklı sayılar için.
            for (int j = 1; j <=9; j++) {
                System.out.println(100*i+10*j+i);
            }
        }
        for (int i = 1; i <=9; i++) {// 4 basamaklı sayılar için.
            for (int j = 1; j <=9; j++) {
                System.out.println(1000*i+100*j+10*j+i);
            }
        }
        }
    }








