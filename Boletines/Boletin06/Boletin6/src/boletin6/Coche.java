/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Coche {
    private int velocidade;

    public Coche(){
    int velocidade =0;
    
}
    public int getVelocidade() {
        velocidade =Integer.parseInt(JOptionPane.showInputDialog("Velocidade actual="));
        return velocidade;
    }                
    public void  acelerar (){
        int valor=Integer.parseInt(JOptionPane.showInputDialog("Valor de aumento="));
         velocidade = velocidade + valor;
     //JOptionPane.showMessageDialog( null, "o valor é igual= " +velocidade);
     amosar();
    }
  public void frenar(){
     int  menos=Integer.parseInt(JOptionPane.showInputDialog("Valor de disminución="));
       velocidade = velocidade - menos;
   //JOptionPane.showMessageDialog( null, "o valor é igual= " +velocidade);
   amosar();
 }

  public void amosar(){
     JOptionPane.showMessageDialog( null, "o valor é igual= " +velocidade); 
  }
}
