package ejercicio7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta cuenta;


    public Cliente(){
        this("Rene","Ramos","1234",new Cuenta());
    }

    public Cliente(String nombre,String apellido,String dni,Cuenta cuentita){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.cuenta=cuentita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public void consultar(){
        double saldo=getCuenta().getSaldo();
        System.out.println("\nTu saldo actual es de: "+saldo);
    }



    public void ingresar(double cantidad){
        double saldo=getCuenta().getSaldo()+cantidad;
        this.cuenta.setSaldo(saldo);
        System.out.println("\ntu nuevo saldo es de: "+saldo);
    }


    public void retirar(double cantidad){
        double saldo=getCuenta().getSaldo();
        if(cantidad<=getCuenta().getSaldo()){
             saldo=getCuenta().getSaldo()-cantidad;
             this.cuenta.setSaldo(saldo);
             System.out.println("\nTu nuevo saldo es de: "+saldo);
        }else{
            System.out.println("\nno puedes retirar mas de lo que tienes");
        }
    }

    public void transferir(Cliente persona,double cantidad){
       double saldo = getCuenta().getSaldo();
       if(cantidad<=saldo){
        saldo-=cantidad;
        this.cuenta.setSaldo(saldo);
        double saldo2=persona.cuenta.getSaldo();
        saldo2+=cantidad;
        persona.cuenta.setSaldo(saldo2);
        System.out.println("\nTransferencia exitosa");
       }else{
            System.out.println("\nNo puede transferir esa cantidad por que no la tiene");
       }
    }

    public static String leer(String mensaje)throws Exception{
        String contenido="";
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader lectura = new BufferedReader(in);
        System.out.println(mensaje);
        contenido=lectura.readLine();
        return contenido;
    }

    public static int menu()throws Exception{
        int opc=0;
        do{
            System.out.println("\n\t.:Bienvenido al cajero automatico:.");
            System.out.println("1.-Consultar saldo");
            System.out.println("2.-Añadir dinero a su cuenta");
            System.out.println("3.-Retirar dinero a su cuenta");
            System.out.println("4.-Transerir dinero a una cuenta");
            System.out.println("5.-Salir");
            opc=Integer.parseInt(leer("Seleccione la operacion que desea realizar"));
        }while(opc<1 || opc>5);
       return opc;
    }

}