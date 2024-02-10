package ejercicio7v2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta cuentas [];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

   public double consultarSaldo(int n){
    return cuentas[n].getSaldo();
   }

   public void ingresarDinero(int n,double cantidad){
        this.cuentas[n].ingresarDinero(cantidad);
   }

   public void retirarDinero(int n,double cantidad){
    this.cuentas[n].retirarDinero(cantidad);
}
    

}
