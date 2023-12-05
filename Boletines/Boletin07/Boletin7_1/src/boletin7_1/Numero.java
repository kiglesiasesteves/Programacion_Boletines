/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Numero {
 
    
    
    public Numero(){
        int numero;
    }
    public void Positivo(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("O número é ="));
       if (numero>0){
        System.out.println("O número "+ numero+" é positivo");
    }
    }
}
