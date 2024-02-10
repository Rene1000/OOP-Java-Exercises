package ejercicio1;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

//constructor  default
Cuadrilatero(){
    this.lado1=5.6f;
    this.lado2=7f;
}

//constructor parametrizado
Cuadrilatero(float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
}
//constructor parametrzado2
Cuadrilatero(float lado){
    this.lado1=lado;
    this.lado2=lado;
}

//constructor copia
Cuadrilatero(Cuadrilatero objeto){
    this.lado1=objeto.lado1;
    this.lado2=objeto.lado2;
}


public float getPerimetro(){
    float perimetro;
    perimetro=(this.lado1*2)+(this.lado2*2);
    return perimetro;
}


public float getPerimetroC(){
    float perimetro;
    perimetro=(this.lado1*4);
    return perimetro;
}



public float getArea(){
    float area=this.lado1*this.lado2;
    return area;
}

public float getLado1() {
    return lado1;
}

public void setLado1(float lado1) {
    this.lado1 = lado1;
}

public float getLado2() {
    return lado2;
}

public void setLado2(float lado2) {
    this.lado2 = lado2;
}



}
