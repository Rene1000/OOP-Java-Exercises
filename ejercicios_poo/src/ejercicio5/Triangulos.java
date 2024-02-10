package ejercicio5;

public class Triangulos  {
    private float lado1;
    private float base;
    


    public Triangulos(){
        this(9.8f,10.9f);
    }
    public Triangulos(float lado1, float base) {
        this.lado1 = lado1;
        this.base = base;
    }

    public  float altura(){
        float altura=(float)Math.sqrt((Math.pow(lado1, 2))-(Math.pow(base/2, 2)));
        return altura;
    }

    public  float area(){
        float altura =altura();
        float area=(this.base*altura)/2;
        return area;
    }

    public float perimetro(){
        float perimetro=(this.lado1*2+this.base);
        return perimetro;
    }

    public static void mostrandoTriangulos(Triangulos trinagulosa[]){
        for(int i=0;i<trinagulosa.length;i++){
            System.out.println(" \nEl trinagulo numero "+(i+1)+" tiene un lado similar de "
            +trinagulosa[i].lado1+" su base es de "+trinagulosa[i].base+" su altura es de "+
            trinagulosa[i].altura()+" El area es "+trinagulosa[i].area()+" y su perimetro es de "+
            trinagulosa[i].perimetro());
        }
    }


}
