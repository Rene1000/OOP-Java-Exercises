package ejercicio8;

public class Main {

    public static int busquedaSecuencial(int n,Paquete paquetes[]){
        int i=0,indice=0;
        boolean encontrado=false;

        while(i<paquetes.length && encontrado==false){
            if(paquetes[i].getnReferencia()==n){
                encontrado=true;
                indice=i;
            }else{
                i++;
            }
        }
        if(encontrado==false){
            indice=-1;
        }
        return indice;
    }
    public static void main(String[] args)throws Exception {
        int nsucursal=0,np=0,nreferencia,opcion=0,indice=0;
        String direccion,ciudad,dni,prioridad;
        double precio=0;
        float peso=0;
        Paquete paquetes [];

        System.out.println("\tBuenos dias");
        System.out.println("\tInserte sus datos");
        nsucursal=Integer.parseInt(Sucursal.leer("\ninserte el numero de la sucursal"));
        direccion=Sucursal.leer("Inserte la direccion de la sucursal");
        ciudad=Sucursal.leer("Inserte la ciudad");


        np=Integer.parseInt(Sucursal.leer("\nInserte el numero de paquetes que quiere recibir"));

        paquetes = new Paquete[np];

        for(int i=0;i<paquetes.length;i++){
            System.out.println("\ninserte los datos del paquete "+(i+1));
            nreferencia=Integer.parseInt(Sucursal.leer("inserte el numero de referencia"));
            dni=Sucursal.leer("inserte su dni");
            paquetes[i]= new Paquete(nreferencia,dni);
        }
            Sucursal uno = new Sucursal(nsucursal,direccion,ciudad,paquetes);
        do{
            opcion=Sucursal.menu();

            if(opcion==1){
              nreferencia=Integer.parseInt(Sucursal.leer("\ninserte el numero de referencia"+
               " del paquete del cual desea conocer el precio"));
               indice=busquedaSecuencial(nreferencia, paquetes);
               if(indice==-1){
                System.out.println("Lo sentimos ese paquete no existe");
               }else{
                System.out.println("digite el tipo de prioridad");
                System.out.println("No");
                System.out.println("Alta");
                System.out.println("Express");
                prioridad=Sucursal.leer("Escriba el tipo de prioridad que desea");
                peso = Float.parseFloat(Sucursal.leer("Ingresa el peso en kilos"));
                precio=uno.precio(indice,prioridad,peso);

                System.out.println("\nEl precio de tu paquete es de: $"+precio+" dolares");
               }

            }

        }while(opcion!=2);

        System.out.println("Tenga un buen dia!");


    }
}
