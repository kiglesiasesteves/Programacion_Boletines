/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Calcular {
    



    public void contar(){
        int i=0;
        int positivo=0;
        int negativo=0;
        int nulo=0;
            for(i=0;i<10;i++){
                int numero = LerDatos.LerEnteiro("Introduzca o número");
                if(numero>0){
                    positivo++;
                }
                else if(numero<0){
                    negativo++;
                }
                else{
                    nulo++;
                }
            }
            JOptionPane.showMessageDialog(null, "Hai "+positivo+" numero(s) positivo(s)");
            JOptionPane.showMessageDialog(null, "Hai "+negativo+" numero(s) negativo(s)");
            JOptionPane.showMessageDialog(null, "Hai "+nulo+" numero(s) igual(es) a 0");
    
}
    }
