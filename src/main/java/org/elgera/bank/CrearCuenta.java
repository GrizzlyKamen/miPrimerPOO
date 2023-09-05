package org.elgera.bank;

public class CrearCuenta {
    public static void main (String[]args){
       Cuenta cuentaDVany = new Cuenta();
       cuentaDVany.saldo = 10000;
       System.out.println("Saldo de la cuenta: " + cuentaDVany.saldo);
    }
}
