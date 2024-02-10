package ejercicio10v2;

public class Doctor extends Persona {
    private String titulacion;
    private int añosExperiecia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int añosExperiecia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiecia = añosExperiecia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiecia() {
        return añosExperiecia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("da asistencia en un partido de futbol");
    }
    @Override
    public void entrenamiento(){
        System.out.println("dar asistencia en un entrenamiento");
    }


    public void curarLesion(){
        System.out.println("curar lesion");
    }
}
