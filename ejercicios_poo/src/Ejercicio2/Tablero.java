package Ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tablero {
    private int x;
    private int y;

    public Tablero(){
        this(0,0);
    }

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int cantidad){
        this.y+=cantidad;
        System.out.println(" Se ha movido hacia arriba");
    }
    
    public void moverAbajo(int cantidad){
        this.y-=cantidad;
        System.out.println(" Se ha movido hacia abajo");
    }
    
    public void moverIzquierda(int cantidad){
        this.x-=cantidad;
        System.out.println(" Se ha movido hacia la izquierda");
    }
    
    public void moverDerecha(int cantidad){
        this.x+=cantidad;
        System.out.println(" Se ha movido hacia la derecha");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public static int menu()throws Exception{
        int opc;
        
        do{
        System.out.println("Elige la opcion que deseas realizar");
        System.out.println("1.-muevete hacia arriba");
        System.out.println("2.-muevete hacia abajo");
        System.out.println("3.-muevete hacia la izquierda");
        System.out.println("4.-muevete hacia la derecha");
        System.out.println("5.-Salir");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(in);
        opc=Integer.parseInt(leer.readLine());
        }while(opc<1 || opc>5);
        return opc;
    }
    
}
