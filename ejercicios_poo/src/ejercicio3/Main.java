package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String marca,modelo,mensaje;
        float precio;
        Vehiculo auto1=null,auto2=null,auto3=null,auto4=null,auto5=null;
        Scanner in = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.println("\ninserte los datos del vehiculo numero "+i);
            System.out.println("inserte la marca");
            marca=in.nextLine();
            System.out.println("inserte el modelo");
            modelo=in.nextLine();
            System.out.println("inserte el precio del auto");
            precio=in.nextFloat();
            in.nextLine();
            
            if(i==1){
                auto1 = new Vehiculo(marca,modelo,precio);
            }
             if(i==2){
                auto2 = new Vehiculo(marca,modelo,precio);
            }
             if(i==3){
                auto3 = new Vehiculo(marca,modelo,precio);
            }
             if(i==4){
                auto4 = new Vehiculo(marca,modelo,precio);
            }
             if(i==5){
                auto5 = new Vehiculo(marca,modelo,precio);
            }
            
        }
        
       mensaje = Vehiculo.mostrarDatos(auto1, auto2, auto3, auto4, auto5);
       System.out.println("\n"+mensaje);

    }
}
