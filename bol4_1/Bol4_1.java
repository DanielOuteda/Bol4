/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bol4_1
        Coche obxcoche = new Coche();
        obxcoche.acelerar(120);
        System.out.println("El coche acelera hasta : "+obxcoche.getVelocidade());
        obxcoche.frenar(25);
        System.out.println("El coche frena hasta : "+obxcoche.getVelocidade());
        
        
        
        
        
        
        
        
    }
    
}
