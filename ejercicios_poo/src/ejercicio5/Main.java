package ejercicio5;

import java.util.Scanner;


public class Main {
    public static float areaMayor(Triangulos triangulosa []){
        int indice=0;
        float area= triangulosa[0].area();
        for(int i=1;i<triangulosa.length;i++){
            if(triangulosa[i].area()>area){
                area=triangulosa[i].area();
                indice=i;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float lado1, base,aream;
        int nt=0;

        System.out.println("Cuantos triangulos desea ingresar");
        nt=in.nextInt();

        Triangulos triangulosa [] = new Triangulos[nt];

        for(int i=0;i<triangulosa.length;i++){
            in.nextLine();
            System.out.println(" \ninserte los datos del primer triangulo "+(i+1));
            System.out.println("inserte el lado igual");
            lado1=in.nextFloat();
            System.out.println("inserte la base");
            base=in.nextFloat();

            triangulosa[i] = new Triangulos(lado1,base);
        }

        aream=areaMayor(triangulosa);
        System.out.println(" \nel area mas grande es de "+aream);

        System.out.println(" \nLos triangulos introducidos fueron los siguientes: ");
        Triangulos.mostrandoTriangulos(triangulosa);


    }
}
