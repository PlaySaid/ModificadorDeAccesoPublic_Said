package Ejercicio2;

public class Ejecucion {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria(931874, 5000000, "Ahorros");
        
        System.out.println(cuenta.numeroCuenta);
        //Nos da un error porque numeroCuenta es private, y no tenemos forma de acceder a el ya que no tiene un getter.//
    }
    
}
