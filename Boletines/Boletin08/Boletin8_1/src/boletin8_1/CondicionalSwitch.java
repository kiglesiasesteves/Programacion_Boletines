/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class CondicionalSwitch {
    
    
public void Switch (){
   String nome=JOptionPane.showInputDialog("Teclea o nome do producto");
    int num=Integer.parseInt(JOptionPane.showInputDialog("Teclea o número"));
  
   if (num <=100){
       System.out.println("O nome é "+nome+ " e o artigo é de de consumo baixo");}
   if (num>100&&num<=500) {
            System.out.println("O nome é "+nome+" e o artigo é de consumo medio");}
        if (num>500&&num<=1000) {
                System.out.println("O nome é "+nome+" e o artigo é  de consumo alto");}
         if (1000<num){ 
            System.out.println("O nome é "+nome+" e o artigo é  de consumo de primera necesidad");}
   
  }  
}
   
    


    

