/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6.pkg3;

public class Boletin63 {
    public static void main(String[] args) {

        circulo obxCir=new circulo();
        obxCir.setRadio(3);
        obxCir.calcularArea();
       obxCir.calcularLonxitude();

        System.out.println("Area circulo: "+obxCir.calcularArea());
        System.out.println("Loxitude circulo: "+obxCir.calcularLonxitude()+".");
    }
}
