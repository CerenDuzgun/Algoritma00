/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ceren
 */
import java.util.Scanner;
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      System.out.println(" Düzgün çokgen kaç kenarlı?");
      int kenarsayisi= input.nextInt();
      System.out.println("Düzgün çokggenin iç açılar toplamı="+ (kenarsayisi-2)*180);
    }
    
}
