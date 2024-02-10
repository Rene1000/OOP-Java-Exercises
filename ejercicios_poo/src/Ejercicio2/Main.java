package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        int n,x,y,cantidad;
        Tablero obj1;
        int opcion=0;

        do{
        System.out.println("Si quires que el objeto inicie en un punto default pulse 1");
        System.out.println("Si quires que el objeto inicie donde tu elijas pulse 2");
        n=in.nextInt();
        }while(n<1 || n>2);
        if(n==1){
            obj1= new Tablero();
        }else{
            System.out.println("inserte su punto en x");
            x=in.nextInt();
            System.out.println("inserte su punto en y");
            y=in.nextInt();
            obj1= new Tablero(x,y);
        }

        
        do {
        opcion=Tablero.menu();
        if(opcion==1){
            System.out.println("inserta cuantos puntos te quieres mover");
            cantidad=in.nextInt();
            obj1.moverArriba(cantidad);

            System.out.println(" \nTu posicion ahora es ("+obj1.getX()+","+obj1.getY()+")");
        }
        else if(opcion==2){
            System.out.println("inserta cuantos puntos te quieres mover");
            cantidad=in.nextInt();
            obj1.moverAbajo(cantidad);

            System.out.println(" \nTu posicion ahora es ("+obj1.getX()+","+obj1.getY()+")");
        }

        else if(opcion==3){
            System.out.println("inserta cuantos puntos te quieres mover");
            cantidad=in.nextInt();
            obj1.moverIzquierda(cantidad);

            System.out.println(" \nTu posicion ahora es ("+obj1.getX()+","+obj1.getY()+")");
        }

        else if(opcion==4){
            System.out.println("inserta cuantos puntos te quieres mover");
            cantidad=in.nextInt();
            obj1.moverDerecha(cantidad);

            System.out.println(" \nTu posicion ahora es ("+obj1.getX()+","+obj1.getY()+")\n");
        }
      }while(opcion!=5);
    }
}
