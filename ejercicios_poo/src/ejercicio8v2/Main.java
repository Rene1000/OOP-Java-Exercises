package ejercicio8v2;

import java.util.Scanner;

public class Main {
    public static int busquedaP(Paquete s [],int n,int pCreadas){
        int indice =0;
        boolean encontrado=false;
        for(int i=0;i<pCreadas && encontrado==false;i++){
            if(s[i].getnPaquete()==n){
                indice=i;
                encontrado=true;
            }
        }
        if(encontrado==false){
            indice=-1;
        }
        return indice;
    }

    public static int busqueda(Sucursal s [],int n,int sCreadas){
        int indice =0;
        boolean encontrado=false;
        for(int i=0;i<sCreadas && encontrado==false;i++){
            if(s[i].getNumeroSucusrsal()==n){
                indice=i;
                encontrado=true;
            }
        }
        if(encontrado==false){
            indice=-1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerosucusrsal,numeropaquete,prioridad,opcion,contadorSucursal=0,contadorPaquete=0,indiceSucursal;
        int indicePaquete;
        String direccion,ciudad,dni;
        double peso,precioPaquete;
        Sucursal sucursal [] = new Sucursal[50];
        Paquete paquetes [] = new Paquete[100];

        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1.-crear una nueva sucursal");
            System.out.println("2.-Enviar paquete");
            System.out.println("3.-Consultar sucursal");
            System.out.println("4.-Consultar paquete");
            System.out.println("5.-Mostrar todas las sucursales");
            System.out.println("6.-Mostrar todos los paquetes");
            System.out.println("7.-Salir");
            System.out.println("digite la operacion que desea realizar");
            opcion=in.nextInt();


            switch(opcion){
                case 1:
                    System.out.println("\nDigite el numero de la sucursal");
                    numerosucusrsal=in.nextInt();
                    in.nextLine();
                    System.out.println("Digite la direccion");
                    direccion=in.nextLine();
                    System.out.println("Digite la ciudad");
                    ciudad=in.nextLine();

                    sucursal[contadorSucursal] = new Sucursal(numerosucusrsal,direccion,ciudad);
                    contadorSucursal++;
                break;

                case 2:
                    System.out.println("\nDigite el numero de sucursal");
                    numerosucusrsal=in.nextInt();
                    indiceSucursal=busqueda(sucursal, numerosucusrsal, contadorSucursal);
                    if(indiceSucursal==-1){
                        System.out.println("la sucursal no existe");

                    }else{
                        System.out.println("\ndigite el numero de paquete");
                        numeropaquete=in.nextInt();
                        in.nextLine();
                        System.out.println("digite el dni de la persona que envia el paquete");
                        dni=in.nextLine();
                        System.out.println("digite el peso del paquete");
                        peso=in.nextDouble();
                        System.out.println("Digite la prioridad (0.-normal, 1.-alta, 2.-Express)");
                        prioridad=in.nextInt();

                        paquetes[contadorPaquete]= new Paquete(numeropaquete,dni,peso,prioridad);

                        precioPaquete=sucursal[indiceSucursal].calcularPrecio(paquetes[contadorPaquete]);

                        System.out.println("El precio es: $"+precioPaquete+" Dolares");
                        contadorPaquete++;

                    }
                break;
                case 3:
                    System.out.println("Digite un numero de sucursal");
                    numerosucusrsal=in.nextInt();

                    indiceSucursal=busqueda(sucursal, numerosucusrsal, contadorSucursal);
                    if(indiceSucursal==-1){
                        System.out.println("Esa sucursal no existe");
                    }else{
                       
                        System.out.println(sucursal[indiceSucursal].mostarDatos());
                    }

                break;

                case 4:
                    System.out.println("Digite el numero de paquete");
                    numeropaquete=in.nextInt();
                    in.nextLine();
                    indicePaquete=busquedaP(paquetes, numeropaquete, contadorPaquete);
                    if(indicePaquete==-1){
                        System.out.println("El paquete no existe");
                    }else{
                        System.out.println(paquetes[indicePaquete].mostrarDatos());
                    }
                break;

                case 5:
                    for(int i=0;i<contadorSucursal;i++){
                        System.out.println("Los datos de la sucursal "+(i+1)+" son:");
                        System.out.println(sucursal[i].mostarDatos());
                    }
                break;

                case 6:
                    for(int i=0;i<contadorPaquete;i++){
                        System.out.println("Los datos del paqute "+(i+1)+" son:");
                        System.out.println(paquetes[i].mostrarDatos());
                    }

                break;

                case 7: break;

                default: System.out.println("error, esa opcion no existe");break;

            }

            System.out.println("");

        }while(opcion!=7);

    }
}
