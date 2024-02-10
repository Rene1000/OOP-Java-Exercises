package ejercicio3v2;

import java.util.Scanner;

public class Main {
    public static int indiceAutos(Vehiculo autos[]){
        float precio;
        int indice=0;
        precio = autos[0].getPrecio();
        for(int i=1;i<autos.length;i++){
            if(autos[i].getPrecio()<precio){
                precio=autos[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int nv=0,imb=0;

        System.out.println("¿Cuantos vehiculos desea insertar?");
        nv=in.nextInt();

        //creamos los objetos para los coches
        Vehiculo autos [] = new Vehiculo[nv];


        //inicializando los objetos del arreglo autos
        for(int i=0;i<autos.length;i++){
            in.nextLine();
            System.out.println(" \nInserte las caracteristicas del auto "+(i+1));
            System.out.println("inserte la marca");
            marca=in.nextLine();
            System.out.println("inserte el modelo");
            modelo=in.nextLine();
            System.out.println("inserte el precio");
            precio=in.nextFloat();

            autos [i] = new Vehiculo(marca, modelo, precio);
        }
        
        imb=indiceAutos(autos);

        System.out.println(autos[imb].mostrarDatos());
        
    }
}
