package p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Empleado extends Persona {
    private String id;
    private Tiempo entrada;
    private Tiempo salida;

    Empleado(){
       

    }

    Empleado(String nombre,String curp, String id, Tiempo entrada, Tiempo salida){
        super(nombre,curp);
        this.id=id;
        this.entrada=entrada;
        this.salida=salida;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tiempo getEntrada() {
        return entrada;
    }

    public void setEntrada(Tiempo entrada) {
        this.entrada = entrada;
    }

    public Tiempo getSalida() {
        return salida;
    }

    public void setSalida(Tiempo salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
       
    return ("El nombre es "+this.getNombre()+" El curp es "+this.getId()+" El id de empleado es "+id+
    " La hora de entrada es de "+entrada+" La hora de salida es "+salida);
    }

    public void horario(){
        System.out.println("La hora de entrada es: "+this.entrada);
        System.out.println("La hora de salida es: "+this.salida);
    }

    public void capturarempleado(String nombre, String curp, String id, Tiempo entrada, Tiempo salida)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(in);
        System.out.println("inserte su nombre");
        nombre=leer.readLine();
        System.out.println("Inserte su curp");
        curp=leer.readLine();
        System.out.println("inserte su id");
        id=leer.readLine();
        System.out.println("inserte la hora de entrada");
        entrada=leer.readLine();


    }
}
