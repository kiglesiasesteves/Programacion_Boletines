/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o cambio");
        float cambio= sc.nextFloat();
        System.out.println("Teclea os euros");
        float euros= sc.nextFloat();
        System.out.println("O importe de euros a dolares é igual a="+(euros*cambio));
    }
    
}
