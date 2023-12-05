/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o número de moedas de 1");
        float uno=sc.nextFloat();
         System.out.println("Teclea o número de billetes de 5");
        float cinco=sc.nextFloat();
          System.out.println("Teclea o número de billetes de 10");
        float diez=sc.nextFloat();
          System.out.println("Teclea o número de billetes de 20");
        float veinte=sc.nextFloat();
          System.out.println("Teclea o número de billetes de 100");
         float cien=sc.nextFloat();
        float total=(+uno*1+ +cinco*5+ +diez*10+ +veinte*20 +cien*100);
        System.out.println("O total é igual a ="+total);
    }
    
}
