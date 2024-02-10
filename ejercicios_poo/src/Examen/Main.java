package Examen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.sampled.SourceDataLine;

public class Main {

        public static void diasLaborales(Electronico o)throws Exception{
            int diasLaborales=0,mes=0;
            try{
                mes=Integer.parseInt(leer("inserte el mes"));
                if(mes==0){
                    throw new Exception("El mes no puede ser cero");
                    
                }
                switch(mes){
                    case 1,2,3,4,5,6: diasLaborales=22;break;
                    case 7,8:diasLaborales=24;break;
                    case 9,10,11,12:diasLaborales=25;break;
                }

            }catch(Exception e){
                diasLaborales=22;
            }
            if(o instanceof Lavanderia){
                ((Lavanderia)o).setDiasLaborales(diasLaborales);
            } else if(o instanceof Clima){
                ((Clima)o).setDiasLaborales(diasLaborales);
            }

        }

        public static void capturar(Electronico o)throws Exception{
            String tipo,marca;
            double potencia,precio;
            int voltaje,metros;
            boolean aCaliente;
            
            if(o instanceof Lavanderia){
                tipo=leer("Inserte el tipo de lavanderia");
                o.setTipo(tipo);
                System.out.println("");
                marca=leer("Inserte la marca");
                o.setMarca(marca);
                potencia=Double.parseDouble(leer("Inserte la potencia"));
                o.setPotencia(potencia);
                voltaje=Integer.parseInt(leer("Inserte el voltaje 120v o 220v"));
                o.setVoltaje(voltaje);
                precio=Double.parseDouble(leer("Inserte el precio"));
                o.setPrecio(precio);
                aCaliente=Boolean.parseBoolean(leer("Inserte si su maquina funciona con aire frio:false o aire caliente:true" ));
                ((Lavanderia)o).setAcaliente(aCaliente);
                diasLaborales(o);
                System.out.println(((Lavanderia)o).toString());
                
            }else if(o instanceof Clima){
                tipo=leer("Inserte el tipo de lavanderia");
                o.setTipo(tipo);
                System.out.println("");
                marca=leer("Inserte la marca");
                o.setMarca(marca);
                potencia=Double.parseDouble(leer("Inserte la potencia"));
                o.setPotencia(potencia);
                voltaje=Integer.parseInt(leer("Inserte el voltaje 120v o 220v"));
                o.setVoltaje(voltaje);
                precio=Double.parseDouble(leer("Inserte el precio"));
                o.setPrecio(precio);
                aCaliente=Boolean.parseBoolean(leer("Inserte si su maquina funciona con aire frio:false o aire caliente:true" ));
                ((Clima)o).setaCaliente(aCaliente);
                diasLaborales(o);
                metros=Integer.parseInt(leer("inserte los mestros que alcanza"));
                ((Clima)o).setMetros(metros);
                System.out.println(((Clima)o).toString());
            }
            
        }

    public static String leer(String mensaje)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader lectura = new BufferedReader(in);
        System.out.println(mensaje);
        return lectura.readLine();
    }

    public static boolean yesNO()throws Exception{
        String decision;
        boolean seguir;
        decision= leer("Desea continuar? s/n");
        if(decision.equals("s")|| decision.equals("S")){
            seguir=true;
        }else{
            seguir=false;
        }
        return seguir;
    }
    public static void main(String[] args)throws Exception {
        boolean continuar=false;
        int opcion;
        double horas,costoHora,consumo=0,costoConsumo=0;


        do{
            System.out.println(".:MENU:.");
            System.out.println("1.- Crear un objeto de tipo lavanderia");
            System.out.println("2.-Crear un objeto de tipo clima");
            System.out.println("digite la opcion que desea realizar");
            opcion=Integer.parseInt(leer("opcion: "));

            if(opcion==1){
                horas=Double.parseDouble(leer("inserte el consumo en horas"));
                costoHora=Double.parseDouble(leer("Inserte el costo"));
                Lavanderia l = new Lavanderia(false, 0);
                capturar(l);
                consumo+=l.getConsumo(horas);
                costoConsumo+=l.getCostoConsumo(horas, costoHora);
                
            }else if(opcion==2){
                horas=Double.parseDouble(leer("inserte el consumo en horas"));
                costoHora=Double.parseDouble(leer("Inserte el costo"));
                Clima c = new Clima(true,0,0);
                capturar(c);
                consumo+=c.getConsumo(horas);
                costoConsumo+=c.getCostoConsumo(horas, costoHora);
            }


            continuar=yesNO();
        }while(continuar);
        System.out.println("El consumo en total de sus aparatos fue de:"+consumo);
        System.out.println("Su pago total es de"+costoConsumo);
    }
}
