package ejercicio10v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList <Persona> personas = new ArrayList<Persona>();
    static Persona futbolista = new Futbolista("Gonzalo", "iguai", 29, 9, "delantero");
    static Persona futbolista2 = new Futbolista("pedro", "Cano", 23, 0, "delantero");
    static Persona entrenador = new Entrenador("Maximiliano", "Alegri", 49, "defensiva");
    static Persona doctor = new Doctor("Juan","Castro",60,"en estomagos",9);
       public static void main(String[] args) {
        personas.add(futbolista);
        personas.add(futbolista2);
        personas.add(entrenador);
        personas.add(doctor);

        menu();
   }


   public static void menu(){
    int opcion=0;
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1.-Viaje de equipo");
            System.out.println("2.-Entrenamiento");
            System.out.println("3.-partido de futbol");
            System.out.println("4.-planificar entrenamiento");
            System.out.println("5.-entrevista");
            System.out.println("6.-curar lesion");
            System.out.println("7.-salir");
            System.out.println("Digite la opcion");
            opcion=in.nextInt();
       

        switch(opcion){
            case 1:System.out.println("");
                viajarEquipo();
            break;

            case 2:System.out.println("");
                entrenarEquipo();
            break;

            case 3:System.out.println("");
                jugarPartidoFutbol();

            break;

            case 4:System.out.println("");
                planificarEntrenamiento();
            break;

            case 5:System.out.println("");
                darEntrevista();
            break;

            case 6:System.out.println("");
                curarLesion();
            break;

            case 7:

            break;

            default: System.out.println("error, no existe esa");

        }
        System.out.println("");
    }while(opcion!=7);
   
   }

   public static void viajarEquipo(){

    for(Persona equipo : personas){
        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" "+equipo.getEdad()+"---> ");
        equipo.viajar();
    }
   }

   public static void entrenarEquipo(){
    for(Persona equipo : personas){
        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" "+equipo.getEdad()+"---> ");
        equipo.entrenamiento();
    }
   }

   public static void jugarPartidoFutbol(){
    for(Persona equipo : personas){
        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" "+equipo.getEdad()+"---> ");
        equipo.partidoFutbol();;
    }
   }

   public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" "+entrenador.getEdad()+"-->");
        Entrenador entrenadorE;
        ((Entrenador)entrenador).planificarEntrenamiento();
   }

   public static void darEntrevista(){
        System.out.print(futbolista.getNombre()+" "+futbolista.getApellido()+" "+futbolista.getEdad()+"-->");
        ((Futbolista)futbolista).entrevista();
        

        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" "+futbolista2.getEdad()+"-->");
        ((Futbolista)futbolista2).entrevista();

   }

   public static void curarLesion(){
    System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" "+doctor.getEdad()+"-->");
    ((Doctor)doctor).curarLesion();
   }
}
