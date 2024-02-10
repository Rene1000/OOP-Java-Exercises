package ejercicio10;

public class Doctor extends Persona {
    private String titulacion;
    private int añosExperiencia;


    public Doctor(){
        super();
        this.titulacion="doctor en estomagos";
        this.añosExperiencia=1;
    }



    public Doctor(String nombre, String apellido, int edad, String titulacion,int añosExperiencia){
        super(nombre,apellido,edad);
        this.titulacion=titulacion;
        this.añosExperiencia=añosExperiencia;
    }



    public String getTitulacion() {
        return titulacion;
    }



    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }



    public int getAñosExperiencia() {
        return añosExperiencia;
    }



    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void partidoDeFutbol(){
        System.out.println("Supervisa a los jugadores para dar asistencia a quien se lastime en el partido");
    }

    @Override
    public void entrenamiento(){
        System.out.println("supervisa a los jugadores para dar asistencia por si hay lesionados"+
        " durante el entrenamiento");
    }


    public void curarLesion(){
        System.out.println("Cura las lesiones de los heridos en batalla");
    }



    @Override
    public String toString() {
        return "Doctor \n"+super.toString()+"\ntitulacion " + titulacion + "\nañosExperiencia " + añosExperiencia;
    }

    


}
