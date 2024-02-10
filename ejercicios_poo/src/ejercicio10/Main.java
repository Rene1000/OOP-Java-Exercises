package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList <Persona> personas = new ArrayList<Persona>();
    public static void main(String[] args) {
       //creando al equipo
       crearPersona();
       menu();

    }

    public static void crearPersona(){
        int opcion=0;
        char seguir;
        do{
            do{
                System.out.println("\t.:Creando tu equipo:.");
                System.out.println("Inserta que tipo de miebro deseas agregar");
                System.out.println("1.-futbolista 2.-Doctor 3.-Entrenador");
                opcion=in.nextInt();
            }while(opcion<1 || opcion>3);
        
            if(opcion==1){
                crearFutbolista();
            }

            else if(opcion==2){
                crearDoctor();
            }

            else if(opcion==3){
                crearEntrenador();
            }
            System.out.println("Desea ingresar un nuevo miembro a su equipo s/n");
            seguir=in.next().charAt(0);
        }while(seguir=='s' || seguir=='S');
    }

    public static void crearFutbolista(){
        int edad,dorsal;
        String nombre,apellido,posicion;

        System.out.println("\nDigite el nombre del futbolista");
        in.nextLine();
        nombre=in.nextLine();
        System.out.println("Digite el apellido del futbolista");
        apellido=in.nextLine();
        System.out.println("Digite la edad del futbolista");
        edad=in.nextInt();
        System.out.println("Digite el dorsal del futbolista");
        dorsal=in.nextInt();
        in.nextLine();
        System.out.println("Digite la posicion del futbolista");
        posicion=in.nextLine();

        Futbolista jugador = new Futbolista(nombre,apellido,edad,dorsal,posicion);

        personas.add(jugador);
    }

    public static void crearDoctor(){
        int edad,añosE;
        String nombre,apellido,titulacion;

        System.out.println("\nDigite el nombre del doctor");
        in.nextLine();
        nombre=in.nextLine();
        System.out.println("Digite el apellido del doctor");
        apellido=in.nextLine();
        System.out.println("Digite la edad del doctor");
        edad=in.nextInt();
        System.out.println("Digite la titulacion del doctor");
        in.nextLine();
        titulacion=in.nextLine();
        System.out.println("Digite los años de experiencia del doctor");
        añosE=in.nextInt();

        Doctor medico = new Doctor(nombre,apellido,edad,titulacion,añosE);

        personas.add(medico);
    }
    public static void crearEntrenador(){
        String estrategia,nombre,apellido;
        int edad;

        System.out.println("\nDigite el nombre del entrenador");
        in.nextLine();
        nombre=in.nextLine();
        System.out.println("Digite el apellido del entrenador");
        apellido=in.nextLine();
        System.out.println("Digite la edad del entrenador");
        edad=in.nextInt();
        System.out.println("Digite la estrategia del entrenador");
        in.nextLine();
        estrategia=in.nextLine();
        Entrenador maestro = new Entrenador(nombre,apellido,edad,estrategia);

        personas.add(maestro);
    }

    public static void menu(){
        int opcion=0;
        do{
                System.out.println("\t.:MENU:.");
                System.out.println("1.-Mostrar los datos de todos los miembros");
                System.out.println("2.-Mostrar los datos de un miembro en especifico");
                System.out.println("3.-hacer viaje");
                System.out.println("4.-hacer entrenamiento");
                System.out.println("5.-jugar partido");
                System.out.println("6.-Entrevistar");
                System.out.println("7.-Planificar entrenamiento");
                System.out.println("8.-Curar lesion");
                System.out.println("9.-mostrar a todos los jugadores");
                System.out.println("10.-salir");
                System.out.println("Elije la opcion que deses realizar");
                opcion=in.nextInt();

                if(opcion==1){
                    mostrarTodo();
                }
                else if(opcion==2){
                    mostrar();
                }
                else if(opcion==3){
                    viaje();
                }
                else if(opcion==4){
                    entrenar();
                }
                else if(opcion==5){
                    jugar();
                }
                else if(opcion==6){
                    Entrevistar();
                }
                else if(opcion==7){
                    planificarE();
                }
                else if(opcion==8){
                    curarLesion();
                }
                else if(opcion==9){
                    mostrarJugadores();
                }
                
        }while(opcion!=10);
    }

    public static void mostrarTodo(){
        for(Persona p : personas){
            System.out.println(p.toString());
        }
    }

    public static void mostrar(){
        boolean encontrado=false;
        String nombre;
        System.out.println("Ingresa el nombre del miembro a quien buscas");
        in.nextLine();
        nombre=in.nextLine();
        for(Persona p : personas){
            if(p.getNombre().equals(nombre)){
                encontrado=true;
                System.out.println(p.toString());
                break;
            }
        }
        if(encontrado==false){
            System.out.println("Ese chavo no es parte del equipo");

        }
    }

    public static void viaje(){
        for(Persona p : personas){
           p.viajar();
        }
    }

    public static void entrenar(){
        for(Persona p : personas){
            p.entrenamiento();
         }
    }

    public static void jugar(){
        for(Persona p : personas){
            p.partidoDeFutbol();
         }
    }

    public static void Entrevistar(){
        for(Persona p : personas){
            if(p instanceof Futbolista){
                Futbolista jugador = (Futbolista) p;
                jugador.entrevista();
            }
         }
    }

    public static void planificarE(){
        String nombre;
        boolean encontrado = false;
        System.out.println("inserte el nombre del entrenador del que"
        +" busca saber como planifica sus entrenamientos");
        in.nextLine();
        nombre=in.nextLine();
        for(Persona p : personas){
            if(p instanceof Entrenador){
                Entrenador maestro = (Entrenador) p;
                if(maestro.getNombre().equals(nombre)){
                    encontrado=true;
                    System.out.println("El entrenador: "+maestro.getNombre());
                    maestro.planificarEntrenamiento();
                    break;
                }
            }
         }
         if(encontrado==false){
            System.out.println("ese entrenador no existe");
         }
    }

    public static void curarLesion(){
        for(Persona p : personas){
            if(p instanceof Doctor){
                Doctor medico = (Doctor) p;
                medico.curarLesion();
                break;
            }
         }
    }
 public static void mostrarJugadores(){
        for(Persona p : personas){
            if(p instanceof Futbolista){
                System.out.println(p.toString());
            }
         }
    }
}
