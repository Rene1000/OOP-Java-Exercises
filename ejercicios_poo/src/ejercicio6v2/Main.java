package ejercicio6v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,opcion;
        double a,b,c,d;
        Complejo numero1,numero2,multiplicacion,suma;

        do{
            System.out.println("\t.:Operaciones con numeros complejos:.");
            System.out.println("1.-sumar");
            System.out.println("2.-multiplicar");
            System.out.println("3.-Comprobacion");
            System.out.println("4.- multiplicar por un entero");
            System.out.println("5.-salir");
            System.out.println("digite la opcion que desee realizar");
            opcion=in.nextInt();

            switch(opcion){
                case 1:System.out.println("\nDigite el  primer numero complejo");
                    System.out.println("Digite la parte real del numero");
                    a=in.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    b=in.nextDouble();
                    System.out.println("\nDigite el segundo numero complejo");
                    System.out.println("Digite la parte real del numero");
                    c=in.nextDouble();
                    System.out.println("Digite la parte imaginaria");
                    d=in.nextDouble();

                    numero1 = new Complejo(a, b);
                    numero2 = new Complejo(c, d);

                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es: "+suma.getA()+"+"+suma.getB()+"i");
                break;
                case 2:System.out.println("\nDigite el  primer numero complejo");
                System.out.println("Digite la parte real del numero");
                a=in.nextDouble();
                System.out.println("Digite la parte imaginaria");
                b=in.nextDouble();
                System.out.println("\nDigite el segundo numero complejo");
                System.out.println("Digite la parte real del numero");
                c=in.nextDouble();
                System.out.println("Digite la parte imaginaria");
                d=in.nextDouble();

                numero1 = new Complejo(a, b);
                numero2 = new Complejo(c, d);

                multiplicacion = numero1.calcularMultiplicacion(numero2);
                System.out.println("La suma es: "+multiplicacion.getA()+"+"+multiplicacion.getB()+"i");
                break;
                case 3:System.out.println("\nDigite el  primer numero complejo");
                System.out.println("Digite la parte real del numero");
                a=in.nextDouble();
                System.out.println("Digite la parte imaginaria");
                b=in.nextDouble();
                System.out.println("\nDigite el segundo numero complejo");
                System.out.println("Digite la parte real del numero");
                c=in.nextDouble();
                System.out.println("Digite la parte imaginaria");
                d=in.nextDouble();

                numero1 = new Complejo(a,b);
                numero2 = new Complejo(c,d);

                if(numero1.igualdad(numero2)){
                    System.out.println("Son iguales");
                }else{
                    System.out.println(" son diferentes");
                }
                break;
                case 4:
                System.out.println("\nDigite el  primer numero complejo");
                System.out.println("Digite la parte real del numero");
                a=in.nextDouble();
                System.out.println("Digite la parte imaginaria");
                b=in.nextDouble();

                System.out.println("digite el entero");
                n=in.nextInt();
                numero1 = new Complejo(a,b);
                multiplicacion = numero1.calcularMporEntero(n);
                System.out.println("La multiplicacion es: "+multiplicacion.getA()+"+"+multiplicacion.getB()+"i");
                break;
            }


            System.out.println("");



        }while(opcion!=5);







    }
}
