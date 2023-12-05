/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Maior {
    Scanner sc=new Scanner (System.in);
    
   
             
             public void Maior(){
                 System.out.println("Escribe o primeiro número");
                  int num1=sc.nextInt();
                                   System.out.println("Escribe o segundo número");

            int num2=sc.nextInt();
                             System.out.println("Escribe o terceiro número");

             int num3=sc.nextInt();
                 if (num1>num2&&num1>num3)
                     System.out.println("O maior é "+num1);
                 else if(num2>num1&&num2>num3)
                     System.out.println("O maior é "+num2);
                 else
                      System.out.println("O maior é "+num3);
             }
                     
    
}
