package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre;
        int ncarrera,nparticipantes,tmenor=0;
        float tiempo;

        System.out.println("Inserta el numero de participantes que hubo en la carrera");
        nparticipantes=in.nextInt();

        Atleta atletas [] = new Atleta[nparticipantes];

        for(int i=0;i<atletas.length;i++){
            in.nextLine();
            System.out.println(" \ninserta los datos del atleta numero "+(i+1));
            System.out.println("Nombre");
            nombre=in.nextLine();
            System.out.println("Numero de carrera");
            ncarrera=in.nextInt();
            System.out.println("Tiempo");
            tiempo=in.nextFloat();

            atletas[i]= new Atleta(nombre,ncarrera,tiempo);


        }

        tmenor=Atleta.tiempoMenor(atletas);

        
            System.out.println(atletas[tmenor].mostrarDatos());
        
        



    }
}
