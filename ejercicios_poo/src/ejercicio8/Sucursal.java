package ejercicio8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sucursal {
    private int nSucursal;
    private String direccion;
    private String ciudad;
    private Paquete paquetes [];


    public Sucursal (){
        this(1234,"enseguida del oxo","Boston",new Paquete[1]);
    }

    public Sucursal(int nSucursal,String direccion,String ciudad,Paquete paquetes[]){
        this.nSucursal=nSucursal;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.paquetes=paquetes;
    }

    public int getnSucursal() {
        return nSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Paquete[] getPaquetes() {
        return paquetes;
    }

    public  double precio(int n,String prioridad,float peso){
       return paquetes[n].precio(prioridad, peso);
    }
    
    

    public static String leer(String mensaje)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader lectura = new BufferedReader(in);
        System.out.println(mensaje);
        return lectura.readLine();
    }

    public static int menu()throws Exception{
        int opc=0;
        do{
            System.out.println("\t.:Bienevenido a la paqueteria:.");
            System.out.println("1.-Checar el precio de algun paquete");
            System.out.println("2.-salir");
            opc=Integer.parseInt(leer("Digite la operacion que desea realizar"));
        }while(opc<1 || opc>2);
        return opc;

    }







}
