package ejercicio7v2;

public class Cuenta {
    private int ncuenta;
    private double saldo;

    public Cuenta(int ncuenta, double saldo) {
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingresarDinero(double cantidad){
        this.saldo+=cantidad;
    }

    public void retirarDinero(double cantidad){
        this.saldo-=cantidad;
    }
    
}
