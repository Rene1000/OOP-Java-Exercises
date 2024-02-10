
import java.util.InputMismatchException;

import java.util.Scanner;

public class App {
   static StringBuffer cadena = new StringBuffer( 20);

   public static boolean yesNo(){
    boolean v;
    String h;
        Scanner in = new Scanner(System.in);
        System.out.println("continuar? s/n");
        h=in.nextLine();
        if(h.equals("s") || h.equals("S")){
            v=true;
        }else{
            v=false;
        }
        return v;
   }
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        String h;
        do{
            System.out.println("ingrese una cadena");
            h=in.nextLine();
            concantenado(h);
        }while(yesNo());
        //String str1 = "Hola";
        //String str2 = "Mundo";
        //String str3 = "!";
        //String result = str1.concat(" ").concat(str2).concat(str3);
        //System.out.println(result); // Hola Mundo!
        //covantenado(str1);

        System.out.println(cadena);
    }

    public static void concantenado(String o){
        cadena.append(o);
        cadena.append(" ");
    }



}
