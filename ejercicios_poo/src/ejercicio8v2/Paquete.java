package ejercicio8v2;

public class Paquete {
    private int nPaquete;
    private String dni;
    private double peso;
    private int prioridad;//0 normal. 1 alta. 2 express

    public Paquete(int nPaquete, String dni, double peso, int prioridad) {
        this.nPaquete = nPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getnPaquete() {
        return nPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    
    public String mostrarDatos(){


        return ("\nNumero del paquete "+this.nPaquete+"\nDni "+this.dni+"\npeso "+this.peso+"\nprioridad "
        +this.prioridad);
    }
    










}
