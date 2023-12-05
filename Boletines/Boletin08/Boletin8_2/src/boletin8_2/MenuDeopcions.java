/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class MenuDeopcions {
    
    
public void MenuDeOpcions(){
        System.out.println("Escriba o numero correspondente a area que desexa calcular tendo en conta que /n Cadrado=1 /n  Triangulo=2 /n Circulo=3");  
        Scanner sc=new Scanner(System.in);
        float num= sc.nextFloat(0);
        switch(num){
            case 1: 
                System.out.println("Dame o valor da base");
                float baseCUA=sc.nextFloat(0);
                System.out.println("El area es igual a "+ baseCUA*baseCUA);
                break;
                 case 2: 
                System.out.println("Dame o valor da base");
                float baseTRI=sc.nextFloat(0);
                  System.out.println("Dame o valor da altura");
                float alturaTRI=sc.nextFloat(0);
                System.out.println("El area es igual a "+ baseTRI*alturaTRI);
                case 3: 
                System.out.println("Dame o valor dO radio");
                float radio=sc.nextFloat(0);
                                System.out.println("El area es igual a "+ radio*radio*Math.PI);
                default:
                    System.out.println("Opción incorrecta");

        }
}
        }
