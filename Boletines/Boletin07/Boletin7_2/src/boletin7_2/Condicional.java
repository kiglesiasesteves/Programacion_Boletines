/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
//Constructor

public class Condicional {
   
    public short solicitarNumero(){
        String resposta = JOptionPane.showInputDialog("Teclea un numero");
        short num = Short.parseShort(resposta);
        return num;
    }
    
    public void SumayResta(){
        short num1 = solicitarNumero();
        short num2 = solicitarNumero();
        if(num1>=num2){
           System.out.println("A resta dos dous numeros é "+(num1-num2));
            
        } 
        else{
           System.out.println("A resta dos dous numeros é "+(num1-num2));
            System.out.println("A suma dos dous numeros é "+(num1+num2));  
        }  
  }    
}
   
         
 