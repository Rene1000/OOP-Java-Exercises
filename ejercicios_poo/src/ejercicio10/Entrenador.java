package ejercicio10;

public class Entrenador extends Persona {

    private String estrategia;


    public Entrenador(){
        super();
        this.estrategia="La vieja confiable";
    }

    public Entrenador(String nombre, String apellido, int edad,String estrategia){
        super(nombre, apellido, edad);
        this.estrategia=estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void partidoDeFutbol(){
        System.out.println("Dirige al equipo en el partido");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Dirige el ntrenamiento");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planifica el entrenamiento");
    }

    @Override
    public String toString() {
        return "Entrenador: "+super.toString() +"\nEstrategia "+ this.estrategia+"\n";
    }

   

}
