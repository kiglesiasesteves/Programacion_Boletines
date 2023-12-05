/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o valor dos grados Celsius");
        float temperatura=sc.nextFloat();
         float fahrenheit=(temperatura*9/5+32);
         double kelvin =(temperatura+273.15);
         System.out.println("A temperatura en Fahrenheit é igual a ="+fahrenheit);
         System.out.println("A temperatura en Kelvin é igual a ="+kelvin);
       
    }
    
}
