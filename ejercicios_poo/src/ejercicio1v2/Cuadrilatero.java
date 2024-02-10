package ejercicio1v2;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero(float lado) {
        this.lado1 =this.lado2=lado;
        
    }

    public float getPerimetro(){
        float perimetro=((this.lado1+this.lado2)*2);
        return perimetro;
    }

    public float getArea(){
        float area =this.lado1*this.lado2;
        return area;
    }
    









}
