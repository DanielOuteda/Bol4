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
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    
    public Satelite (){
        
    }
    
    public Satelite (double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTierra = d;     
    }
    
    public void setMeridiano(int m){
        this.meridiano = m;
    }
    
    public void setParalelo(int p){
        this.paralelo = p;
    }
    
    public void setDistanciaTierra(int d){
        this.distanciaTierra = d;
    }
            
            
    public void verPosicion (){
        System.out.println("O satelite atopase no paralelo "+paralelo+ " no meridiano "+meridiano+ " e a unha distancia da terra " +distanciaTierra);
    }
}
