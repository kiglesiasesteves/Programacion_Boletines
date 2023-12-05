/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o primeiro número");
        double num1= sc.nextFloat();
        System.out.println("Teclea o segundo número");
        double num2= sc.nextFloat();
        System.out.println("La suma es="+(num1+num2));
        System.out.println("La resta es="+(num1-num2));
        System.out.println("La multiplicación es="+(num1*num2));
        System.out.println("El cociente es="+(num1/num2));
    }
    
}
