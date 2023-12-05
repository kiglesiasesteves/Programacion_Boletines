/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6.pkg3;

/**
 *
 * @author dam1
 */
public class circulo {
    private double radio;
    private final double Pi = 3.14 ;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return Pi;
    }
    public double calcularArea() {
        return getPi() * Math.pow(getRadio(),2);
    }
    public double calcularLonxitude(){
        return 2*getPi()*getRadio();
    }
}