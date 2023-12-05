/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o valor do teu soldo fixo");
        float sf=sc.nextFloat();
        System.out.println("Teclea o valor das tuas vendas");
        double vendas=0.05*sc.nextFloat();
        System.out.println("Teclea o valor dos teus kilometros recorridos");
        float km=2*sc.nextFloat();
        System.out.println("Teclea o valor dos dias de desprazamento");
        float dia=30*sc.nextFloat();
        double sl= (sf+vendas+km+dia);
        System.out.println("O saldo líquido é igual a="+sl);
        
    }
    
}
