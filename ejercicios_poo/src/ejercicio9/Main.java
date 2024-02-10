package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        //llenar poligono
        llenarPoligono();

        //mostrar los datos y el area de cada poligonos
        mostrarDatos();
    }

    public static void llenarPoligono(){
        int opcion=0;
        char respuesta;
        do{
            do{
            System.out.println("Digite que poligono desea");
            System.out.println("1.-Triangulo");
            System.out.println("2.-Rectangulo");
            System.out.println("Digite una opcion");
            opcion=in.nextInt();
            }while(opcion<1 || opcion>2);
            switch(opcion){
                case 1:
                    llenarTriangulo();

                break;

                case 2:
                    llenarRectangulo();

                break;
            }
            System.out.println("Desea guardar otro poligono digite s/n");
            respuesta=in.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s' || respuesta=='S');
    }


    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("\nDigite el lado uno");
        lado1=in.nextDouble();
        System.out.println("Digite el lado dos");
        lado2=in.nextDouble();
        System.out.println("Digite el lado tres");
        lado3=in.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("\nDigite el lado largo del rectangulo");
        lado1=in.nextDouble();
        System.out.println("\nDigite el lado ancho del rectangulo");
        lado2=in.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        poligonos.add(rectangulo);

    }

    public static void mostrarDatos(){
        
        for(Poligono poli : poligonos){
            System.out.println(poli.toString()+"\nSu area es de "+poli.area());
            System.out.println("");
        }


    }









}
