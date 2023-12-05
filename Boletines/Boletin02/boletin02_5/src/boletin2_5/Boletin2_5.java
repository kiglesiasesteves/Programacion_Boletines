/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        System.out.println("Teclea a distancia en millas");
        double millas= sc.nextFloat();
        final int VALOR = 1852;
         System.out.println("La distancia en metros es="+(VALOR*millas));
                
    }
    
}
