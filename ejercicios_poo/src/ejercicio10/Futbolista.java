package ejercicio10;

public class Futbolista extends Persona {
    private int dorsal;
    private String  posicion;



    public Futbolista(){
        super();
        this.dorsal=10;
        this.posicion="Delantero";
    }


    public Futbolista(String nombre, String apellido, int edad,int dorsal, String posicion){
        super(nombre,apellido,edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }


    public int getDorsal() {
        return dorsal;
    }


    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    public String getPosicion() {
        return posicion;
    }


    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void entrevista(){
        System.out.println("El jugador de futbol da la entrevista y decide si reclutar al prospecto o no");
    }

    @Override
    public void partidoDeFutbol(){
        System.out.println("El futbolista juega en el partido");
    }

    @Override
    public void entrenamiento(){
        System.out.println("El futbolista practica jugadas en el entrenamiento");
    }


    @Override
    public String toString() {
        return "Futbolista\n"+super.toString()+"dorsal " + this.dorsal + "\nposicion " + this.posicion+"\n";
    }

    

}
