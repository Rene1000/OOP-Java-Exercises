package ejercicio6;

public class Main {
    public static void main(String[] args)throws Exception{
        double a,b;
        int opcion,n;
        Complejo numero1,numero2;
        do{
             opcion=Complejo.menu();

             if(opcion==1){
                a=Double.parseDouble(Complejo.leer("inserte la parte real del numero 1"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 1"));
                numero1 = new Complejo(a,b);

                a=Double.parseDouble(Complejo.leer("\ninserte la parte real del numero 2"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 2"));
                numero2 = new Complejo(a,b);

                System.out.println(Complejo.suma(numero1, numero2));
                

             }
             else if(opcion==2){
                 a=Double.parseDouble(Complejo.leer("inserte la parte real del numero 1"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 1"));
                numero1 = new Complejo(a,b);

                a=Double.parseDouble(Complejo.leer("\ninserte la parte real del numero 2"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 2"));
                numero2 = new Complejo(a,b);

                System.out.println(Complejo.multiplicacion(numero1, numero2));
                
             }
             else if(opcion==3){
                a=Double.parseDouble(Complejo.leer("\ninserte la parte real del numero 1"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 1"));
                numero1 = new Complejo(a,b);

                a=Double.parseDouble(Complejo.leer("inserte la parte real del numero 2"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 2"));
                numero2 = new Complejo(a,b);

                System.out.println(Complejo.igualdad(numero1, numero2));

                
             }
             else if(opcion==4){

                a=Double.parseDouble(Complejo.leer("inserte la parte real del numero 1"));
                b=Double.parseDouble(Complejo.leer("inserte la parte imaginaria del numero 1"));
                numero1 = new Complejo(a,b);

                n=Integer.parseInt(Complejo.leer("\ninserta el numero entero"));


                System.out.println(Complejo.mEntero(numero1, n));
                

             }

        }while(opcion!=5);
        
        
    }
}
