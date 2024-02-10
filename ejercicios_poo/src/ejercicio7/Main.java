package ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        String nombre,apellido,dni;
        int opcion=0,ncuenta;
        double cantidad,saldo;
        Cuenta cuenta1;
        Cliente persona1,persona2;
        Scanner in = new Scanner(System.in);
        System.out.println("\t.:Bienvenido al banco:.");
        System.out.println("Para crear una cuenta conteste los siguientes datos");
        System.out.println("1.-inserte su nombre");
        nombre=in.nextLine();
        System.out.println("2.-inserte su apellido");
        apellido=in.nextLine();
        System.out.println("3.-inserte su dni");
        dni=in.nextLine();
        System.out.println("4.-inserte su numero de cuenta");
        ncuenta=in.nextInt();
        System.out.println("5.-inserte su saldo inicial");
        saldo=in.nextDouble();
        cuenta1 = new Cuenta(ncuenta,saldo);
        persona1 = new Cliente(nombre,apellido,dni,cuenta1);


        do{
            opcion=Cliente.menu();
            if(opcion==1){
                
                persona1.consultar();
            }
            else if(opcion==2){
               cantidad=Double.parseDouble(Cliente.leer("Ingrese la cantidad que va a ingresar"));
               persona1.ingresar(cantidad);
            }
            else if(opcion==3){
                cantidad=Double.parseDouble(Cliente.leer("Ingrese la cantidad que va a retirar"));
                persona1.retirar(cantidad);
            }

            else if(opcion==4){
                Cliente.leer("Inserte el numero de cuenta a al que se dirige el dinero");
                persona2 = new Cliente();
                cantidad=Double.parseDouble(Cliente.leer("Ingrese la cantidad que va a transferir"));
                persona1.transferir(persona2, cantidad);

                System.out.println("El saldo de la persona ahora es de: "+persona2.getCuenta().getSaldo());
            }
            
        }while(opcion!=5);
        System.out.println("\nTenga un buen dia");
    }
}
