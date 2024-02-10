package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float lado1,lado2;

        Scanner in = new Scanner(System.in);
        System.out.println("Inserte el lado 1");
        lado1= in.nextFloat();
        System.out.println("Inserte el lado 2");
        lado2=in.nextFloat();

        Cuadrilatero c1 = new Cuadrilatero();
        System.out.println("\nEl cuadrlatero 1 es igual a \n"+c1.getPerimetro());
        
        Cuadrilatero c2 = new Cuadrilatero(7.8f,9.0f);
        System.out.println("\nEl cuadrlatero 2 es igual a \n"+c2.getPerimetro()+" y su area "
        +c2.getArea());

        Cuadrilatero c3 = new Cuadrilatero(lado1,lado2);
        c3.setLado1(5);
        c3.setLado2(4);
        System.out.println("\nEl cuadrlatero 3 es igual a \n"+c3.getPerimetro()+" y su area "
        +c3.getArea());

        System.out.println("inserte el lado del cuadrilatero");
        Cuadrilatero c4 = new Cuadrilatero(2.0f);
        System.out.println("\nEl cuadrilatero 4 es igual a \n"+c4.getPerimetro()+" y su area "
        +c4.getArea());



    }
}
