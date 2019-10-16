/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_2;

/**
 *
 * @author doutedasolla
 */
public class Bol4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bol4_2
        Satelite obxSatelite = new Satelite();
        obxSatelite.setParalelo(130);
        obxSatelite.setMeridiano(684);
        obxSatelite.setDistanciaTierra(46648);
        obxSatelite.verPosicion();
    }
    
}
