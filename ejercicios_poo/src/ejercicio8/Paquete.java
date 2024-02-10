package ejercicio8;

public class Paquete {
    private int nReferencia;
    private String dni;

    public Paquete(){
        this(1234,"6yhj");
    }

    public Paquete(int nReferencia, String dni){
        this.nReferencia=nReferencia;
        this.dni=dni;
    }

    public int getnReferencia() {
        return nReferencia;
    }

    public String getDni() {
        return dni;
    }

    public double precio(String prioridad,float peso){
        String p1="No",p2="Alta",p3="Express";
        double precio=0;
        if(prioridad.equals(p1)){
            precio=peso*1;
        }
        else if(prioridad.equals(p2)){
            precio=peso*1+10;
        }
        else if(prioridad.equals(p3)){
            precio=peso*1+20;
        }
        return precio;
    }







}
