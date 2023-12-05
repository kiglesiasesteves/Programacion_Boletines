/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin9_2;

/**
 *
 * @author dam1
 */
public class Calcular {
   public void SumyResta(){
        int acuSum=10;
        double acuProd=10;
        int i=0;
        int num=10;
        while(i<100){
            acuSum=acuSum+(++num);
            acuProd=acuProd*(++num);
            i++;
        System.out.println("A suma dos numeros do 10 ao 100 e igual a "+acuSum);
        System.out.println("O producto dos numeros do 10 ao 100 e igual a "+acuProd);
    }
}
    
}
    

