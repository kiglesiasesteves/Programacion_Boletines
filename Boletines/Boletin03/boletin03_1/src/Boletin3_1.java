/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o prezo da tarifa");
        float prezotarifa= sc.nextFloat();
        System.out.println("Teclea o prezo pagado");
        float prezopagado= sc.nextFloat();
        float porcentaxe= (100-(prezopagado*100/prezotarifa));
        System.out.println("O desconto total é = "+porcentaxe);
        
                
    }
    
}
