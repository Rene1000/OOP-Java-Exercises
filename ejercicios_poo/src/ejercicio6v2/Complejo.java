package ejercicio6v2;

public class Complejo {
    private double a;
    private double b;


    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }

    public Complejo calcularSuma(Complejo numero){
        Complejo suma = new Complejo(this.a+numero.a,this.b+numero.b);
        return suma;
    }

    public Complejo calcularMultiplicacion(Complejo numero){
        Complejo multiplicacion = new Complejo((this.a*numero.a-this.b*numero.b), (this.a*numero.b+this.b*numero.a));
        return multiplicacion;
    }

    public boolean igualdad(Complejo numero){
        if(this.a==numero.a && this.b==numero.b){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Complejo calcularMporEntero(int n){
        Complejo mE = new Complejo(this.a*n, this.b*n);
        return mE;
    }





    
}
