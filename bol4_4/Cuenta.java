/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_4;

/**
 *
 * @author doutedasolla
 */
public class Cuenta {

    private String nomb, nuCuen;
    private double tipIn, saldo;

    public Cuenta() {
    }

    public Cuenta(String nom, String nCuen, double tIn, double sal) {
        nomb = nom;
        nuCuen = nCuen;
        tipIn = tIn;
        saldo = sal;
    }

    public void setNom(String nomNew) {
        nomb = nomNew;
    }

    public void setNCu(String nCuNew) {
        nuCuen = nCuNew;
    }

    public void setTip(double tipNew) {
        tipIn = tipNew;
    }

    public void setSal(double salNew) {
        saldo = salNew;
    }

    public double getSal() {
        return saldo;
    }

    public void getData() {
        System.out.println("Nombre: " + nomb + ", Nr Cuenta: " + nuCuen + ", Tipo interes: " + tipIn + "%, Saldo: " + saldo + ".");
    }

    public String getNom() {
        return nomb;
    }

    public void ingreso(double ing) {
        saldo = saldo + ing;
    }

    public void reintegro(double reint) {
        saldo = saldo - reint;
    }

    public void transferencia(Cuenta cnomb, double importe) {
        System.out.println("Traspaso de: " + importe + " entre, " + nomb + " y " + cnomb.getNom());
        setSal(saldo - importe);
        //System.out.println(getSal());
        System.out.println("Saldo actual de " + nomb + ": " + getSal());
        cnomb.setSal(cnomb.getSal() + importe);
        System.out.println("Saldo actual de " + cnomb.getNom() + ": " + cnomb.getSal());
    }
}
