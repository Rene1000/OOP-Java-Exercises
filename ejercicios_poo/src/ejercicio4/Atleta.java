package ejercicio4;

public class Atleta {
    private String nombre;
    private int ncarrera;
    private float  tiempo;



    public Atleta(){
        this("Juan",4,1.2f);
    }

    public Atleta(String nombre, int ncarrera, float tiempo){
        this.nombre=nombre;
        this.ncarrera=ncarrera;
        this.tiempo=tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatos(){
        return ("\nEl nombre del ganador es:"+this.nombre+"\nsu numero de carrera es: "+this.ncarrera
        +"\nsu tiempo fue de "+this.tiempo);
    }
    
    public static int tiempoMenor(Atleta atletas[]){
        int indice=0;
        float menor = atletas[0].tiempo;

        for(int i=1;i<atletas.length;i++){
            if(atletas[i].tiempo<menor){
                menor=atletas[i].tiempo;
                indice=i;
            }

        }

        return indice;
    }

    
}
