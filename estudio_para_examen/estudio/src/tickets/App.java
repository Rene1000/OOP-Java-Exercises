package tickets;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args)throws Exception {
        double acumPreciovip=0,acumPrecion=0;
        int nt,vip,normal;
        System.out.println("Bienvenido a la sala");
        nt=Integer.parseInt(leer("Inserte el numero de tickets"));
        do{
            normal=Integer.parseInt(leer("Inserte cuantos boletos normales quiere"));
            vip=Integer.parseInt(leer("Inserte cuantos boletos vip desea"));
            if(vip<=nt){
                nt-=vip;
            }
            if(normal<=nt){
                nt-=normal;
            }

        }while(vip<=nt && normal<=nt);
        acumPrecion=normal*34;
        acumPreciovip=vip*80;

        
    }

    public static String leer(String mensaje)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(in);
        System.out.println(mensaje);
        return leer.readLine();
    }




}
