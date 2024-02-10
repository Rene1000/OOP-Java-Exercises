package ejercicio10;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this("Rene","Ramos",22);
    }

    public Persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void viajar(){
        System.out.println("Todo el equipo viaja en camiones de lujo");
    }

    public abstract void partidoDeFutbol();
    
    public abstract void entrenamiento();

    @Override
    public String toString() {
        return " nombre " + this.nombre + "\napellido " +this.apellido + "\nedad " + this.edad+"\n";
    }

    




}
