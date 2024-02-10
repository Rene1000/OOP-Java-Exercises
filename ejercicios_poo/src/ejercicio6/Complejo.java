package ejercicio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Complejo {
    private double a;
    private double b;

    public Complejo(){
        this(3.5,6.9);
    }

    public Complejo(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public static String suma(Complejo obj,Complejo obj2){
        double suma1=obj.a+obj2.a;
        double suma2=obj.b+obj2.b;
        String suma="La suma del numero complejo es=\n"+suma1+"+ "+suma2+"i";
        return suma;
    }
    
    public static String multiplicacion(Complejo obj,Complejo obj2){
        double m1=obj.a*obj2.a;
        double m2=obj.a*obj2.b;
        double m3=obj.b*obj2.a;
        double m4=obj.b*obj2.b;
        m4*=-1;
        double multiplicacion = m1+m4;
        double multiplicacion2 = m2+m3;
        String resultado="La multiplicacion es = "+multiplicacion+"+"+multiplicacion2+"i";
        return resultado;
    }

    public static String igualdad(Complejo obj, Complejo obj2){
        String igualdad;
        if(obj.a==obj2.a && obj.b==obj2.b){
            igualdad="Son iguales";
        }
        else{
            igualdad="Son diferentes";
        }
        return igualdad;
    }

    public static String mEntero(Complejo obj,double n){
        double me= obj.a*n;
        double me2= obj.b*n;
        String complejo=""+me+"+"+me2+"i";
        return complejo;
        
    }

    public static String leer(String mensaje)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer= new BufferedReader(in);
        System.out.println(mensaje);
        String lectura =leer.readLine();
        return lectura;
    }

    public static int menu()throws Exception{
        int opc=0;
        do{
        System.out.println("Bienvenidos a la calculadora de numeros complejos");
        System.out.println("1.- sumar dos numeros complejos");
        System.out.println("2.- multiplicar dos numeros complejos");
        System.out.println("3.- comprobar si dos numeros complejos son iguales");
        System.out.println("4.- multiplicar un numero complejo por un entero");
        System.out.println("5.- salir");
        opc=Integer.parseInt(leer("Inserte la opercaion que desea realizar"));
        }while(opc<1 || opc>5);
        return opc;

    }


}
