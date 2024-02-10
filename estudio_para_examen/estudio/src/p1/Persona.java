package p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Persona{
    private String nombre;
    private String curp;

    Persona(){
        this("Jose","1234");
    }

    Persona(String nombre, String curp){
        this.nombre=nombre;
        this.curp=curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }


    @Override
    public String toString() {
        return "Nombre: "+this.nombre+" Curp: "+this.curp;
    }

    public void capturarPersona()throws Exception{
        String nombre,curp;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(in);
        System.out.println("ingrese su nombre");
        nombre=leer.readLine();
        System.out.println("Ingrese su curp");
        curp=leer.readLine();



    }
    public void capturarPersona(String nombre ,String curp)throws Exception{
        if(nombre.equals("")){
            System.out.println("El nombre no es valido");
        }
        else{
            this.nombre=nombre;
        }
        if(curp.equals("")){
            this.curp=curp;

        }
    }

}