/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Definir {
            Scanner sc =new Scanner (System.in);


    public  int Setnum1(){
        System.out.println("Escribe el número");
         int num1 = sc.nextInt();
         return num1;

    }
    
    
    public void Positivo(){
        int num1=Setnum1();
       
    if(num1>0)
            System.out.println("+");
    else if(num1<0)
            System.out.println("-");
    else
            System.out.println("0");
    
    
    
}
}
