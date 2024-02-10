package ejercicio7;

public class Cuenta {
    private int nCuenta;
    private double saldo;

    public Cuenta(){
        this(12367,2000);
    }

    public Cuenta(int nCuenta,double saldo){
        this.nCuenta=nCuenta;
        this.saldo=saldo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    



}
