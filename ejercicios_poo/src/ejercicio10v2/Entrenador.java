package ejercicio10v2;

public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido de futbol");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Dirige el entrenamiento");
    }

    public void planificarEntrenamiento(){
        System.out.println("planificar el entrenamiento");
    }



}
