/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class PesoeAltura {
    int Peso1;
     int Peso2;
     String Nome1;
             String Nome2;
            Scanner sc=new Scanner(System.in);

      public String SetNome1(){
        System.out.println("Escribe o nome da primeira persoa");
        String Nome1=sc.nextLine();
        return Nome1;
        
            
            }
            public int SetPeso1(){
        System.out.println("Escribe o peso da primeira persoa");
        int Peso1=sc.nextInt();
        return Peso1;
        
            
            }
              public String SetNome2(){
        System.out.println("Escribe o nome da segunda persoa");
        String Nome2=sc.nextLine();
        return Nome2;
        
            
            }
  
    public int SetPeso2(){
        System.out.println("Escribe o peso da segunda persoa");
        int Peso2=sc.nextInt();
        return Peso2;
        
            
            }
     public void PesaMais(){
               String Nome1=SetNome1();
                String Nome2=SetNome2();

        int Peso1=SetPeso1();
       int Peso2=SetPeso2();
    

        if (Peso1<Peso2){
            System.out.println("O que pesa máis é "+ Nome2 +" e o peso é "+Peso2); 
        System.out.println("A diferenza é " +(Peso2-Peso1));
       
                }
        else{
       System.out.println(" O que pesa máis é "+ Nome1 +" e o peso é "+Peso1);
              System.out.println("A diferenza é " +(Peso1-Peso2));

        }
              
 
    }
    
   
    
    
}
