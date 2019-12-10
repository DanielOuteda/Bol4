/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ra;
        Scanner teclado = new Scanner(System.in);
        Circulo uno = new Circulo();
        Circulo dos = new Circulo(4);

        System.out.println("Radio del circulo: ");
        ra = teclado.nextDouble();
        Circulo tres = new Circulo(ra);
        System.out.println("Circulo 1:");
        uno.getDat();
        System.out.println("Cambiar el radio a: ");
        uno.setRadio(teclado.nextDouble());
        System.out.println("Circulo 1:");
        uno.getDat();
        System.out.println("Circulo 2:");
        dos.getDat();
        System.out.println("Circulo 3:");
        tres.getDat();
        System.out.println("Area: " + tres.calcularArea());
        System.out.println("Longitud: " + tres.calcularLonxitude());
    }

}
