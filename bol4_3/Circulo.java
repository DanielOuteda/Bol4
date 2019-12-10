/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_3;

/**
 *
 * @author doutedasolla
 */
public class Circulo {

    private double radio;
    private static final double PI = 3.14;

    public Circulo() {
    }

    public Circulo(double rad) {
        radio = rad;
    }

    public void setRadio(double nRad) {
        radio = nRad;
    }

    public void getDat() {
        System.out.println("Radio: " + radio);
    }

    public double calcularArea() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularLonxitude() {
        double lon = 2 * PI * radio;
        return lon;
    }
}
