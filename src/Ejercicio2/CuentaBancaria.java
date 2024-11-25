package Ejercicio2;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarDetalles() {
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
    }
}
