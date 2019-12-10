/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Cuenta cli1 = new Cuenta();
        Cuenta cli2 = new Cuenta("Pablo", "CD34FG", 1, 2000);
        String nCli, nCu;
        double tIn, sal;

        cli1.getData();
        cli2.getData();
        System.out.print("Nombre Cliente: ");
        nCli = teclado.next();
        System.out.print("Numero de cuenta: ");
        nCu = teclado.next();
        System.out.print("Tipo interes: ");
        tIn = teclado.nextDouble();
        System.out.print("Saldo en cuenta: ");
        sal = teclado.nextDouble();
        System.out.print("Cantidad a ingresar: ");
        cli2.ingreso(teclado.nextDouble());
        System.out.println("Saldo actual: " + cli2.getSal());
        System.out.print("Cantidad a retirar :");
        cli2.reintegro(teclado.nextDouble());
        System.out.println("Saldo actual: " + cli2.getSal());
        Cuenta cli3 = new Cuenta(nCli, nCu, tIn, sal);
        cli3.getData();
        //Transferencia con metodo
        System.out.println("Cantidad a transferir: ");
        cli2.transferencia(cli3, teclado.nextDouble());
        //Transferencia sin metodo
        System.out.print("Cantidad a transferir: ");
        double trans = teclado.nextDouble();
        cli2.setSal(cli2.getSal() - trans);
        cli3.setSal(cli3.getSal() + trans);
        System.out.println("Saldo nuevo cliente 2: " + cli2.getSal());
        System.out.println("Saldo nuevo cliente 3: " + cli3.getSal());
    }

}
