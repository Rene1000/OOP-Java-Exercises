package ejercicio7v2;

import java.util.Scanner;

public class Main {

    public static int buscarNumeroCuenta(Cuenta Cuentas[],int n){
        int i=0,indice=0;
        boolean encontrado=false;

        //busqueda secuecial
        while(i<Cuentas.length && encontrado==false){
            if(Cuentas[i].getNcuenta()==n){
                indice=i;
                encontrado=true;
            }
            i++;
        }
        if(encontrado==false){
            indice=-1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre,apellido,dni;
        int ncuenta,numerocuenta,opcion=0,indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas [];
        Cliente cliente;

        System.out.println("ingrese el nombre");
        nombre= in.nextLine();
        System.out.println("ingrese su apellido");
        apellido=in.nextLine();
        System.out.println("ingresa tu dni");
        dni=in.nextLine();
        System.out.println("ingrea el numero de cuentas que quieres crear");
        ncuenta=in.nextInt();

        cuentas = new Cuenta[ncuenta];

        for(int i=0;i<cuentas.length;i++){
            System.out.println("digite los datos para la cuenta "+(i+1));
            System.out.println("digite el numero de cuenta");
            numerocuenta=in.nextInt();
            System.out.println("digite el saldo");
            saldo=in.nextDouble();

            cuentas [i] = new Cuenta(numerocuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);


        do{
            System.out.println("menu");
            System.out.println("1.-ingresar dinero en la cuenta");
            System.out.println("2.-retirar dinero de la cuenta");
            System.out.println("3.-consultar saldo de la cuenta");
            System.out.println("4.-salir");
            System.out.println("ingrse que operacion desea realizar");
            opcion=in.nextInt();

            switch(opcion){
                case 1: 
                    System.out.println("Digite el numero de cuenta");
                    numerocuenta=in.nextInt();
                    indiceCuenta=buscarNumeroCuenta(cuentas,numerocuenta);
                    if(indiceCuenta==-1){
                        System.out.println("Ese numero de cuenta  no existe");
                    }else{
                        System.out.println("digite la cantidad que va a ingresar");
                        cantidad=in.nextDouble();

                        cliente.ingresarDinero(indiceCuenta, cantidad);
                        System.out.println("operacion realizada correctamente");
                        System.out.println("saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
                    }
                break;

                case 2:
                System.out.println("Digite el numero de cuenta");
                numerocuenta=in.nextInt();
                indiceCuenta=buscarNumeroCuenta(cuentas,numerocuenta);
                if(indiceCuenta==-1){
                    System.out.println("Ese numero de cuenta  no existe");
                }else{
                    System.out.println("digite la cantidad de dinero que desea retirar");
                    cantidad=in.nextDouble();
                    if(cantidad>cliente.consultarSaldo(indiceCuenta)){
                        System.out.println("Saldo insuficiente");
                    }else{
                        cliente.retirarDinero(indiceCuenta, cantidad);
                    System.out.println("operacion realizada correctamente");
                        System.out.println("saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
                    }
    
                }

                break;

                case 3:
                System.out.println("Digite el numero de cuenta");
                numerocuenta=in.nextInt();
                indiceCuenta=buscarNumeroCuenta(cuentas,numerocuenta);
                if(indiceCuenta==-1){
                    System.out.println("Ese numero de cuenta  no existe");
                }else{
                   System.out.println(cliente.consultarSaldo(indiceCuenta)); 
                }
                break;

                case 4: break;
                default: System.out.println("error, no existe esa opcion");
            }







        }while(opcion!=4);




    }
}
