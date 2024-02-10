package Examen2;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.InputStreamReader;

import javax.sound.sampled.SourceDataLine;

public class Main {

    public static boolean yesNo()throws Exception{
        boolean seguir;
        String l;
        l=leer("Continuar? s/n");
        if(l.equals("s")|| l.equals("S")){
            seguir=true;
        }else{
            seguir=false;
        }
        return seguir;
    }



    public static String leer(String mensaje)throws Exception{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader lectura = new BufferedReader(in);
        System.out.println(mensaje);
        return lectura.readLine();
    }
    public static void main(String[] args)throws Exception {
        int opcion=0;
        double costoTotal=0;
            do{
                System.out.println(".:MENU:.");
                System.out.println("1.-TrabjaoPintura");
                System.out.println("2.-Revision alarma");
                opcion=Integer.parseInt(leer("Opcion"));

                if(opcion==1){
                    TrabajoPintura tp = new TrabajoPintura(0, 0);
                    capturarObjeto(tp);
                    costoTotal+=tp.costoTotal();
                }
                else if(opcion==2){
                    RevisionAlarma ra= new RevisionAlarma(null, null, 0);
                    capturarObjeto(ra);
                    costoTotal+=ra.costoTotal();
                }

                
            }while(yesNo());
            System.out.println("Por todos sus trabajos usted pagara $"+costoTotal);
    }

    public static void capturarFecha(Servicio o)throws Exception{
        String mes;
        String dia;
        String fecha;
        try{
            System.out.println("Capturando la fecha");
            dia=leer("Inserte el dia");
            mes=leer("Inserte el mes");
            fecha=dia.concat("/").concat(mes).concat("/").concat("2023");
            if(mes.equals("0")||dia.equals("0")){
                throw new Exception("No se vale poner 0");
            }
        }catch(Exception a){
            fecha="01/01/2023";

        }
        o.setFechaInicio(fecha);
    }

    public static void capturarObjeto(Servicio o)throws Exception{
        String trabajador,fecha,cliente;
        double superficie=0,precioPintura;
        int nAlarmas;
        if(o instanceof TrabajoPintura){
            trabajador=leer("Inserte el nombre del trabajador");
            o.setTrabajador(trabajador);
            capturarFecha(o);
            cliente=leer("Inserte el  nombre del cliente");
            o.setCliente(cliente);
            superficie=Double.parseDouble(leer("Inserte el tamaño de la superficie"));
            ((TrabajoPintura)o).setSuperficie(superficie);
            precioPintura=Double.parseDouble(leer("Inserte el precio de la pintura"));
            ((TrabajoPintura)o).setPrecioPintura(precioPintura);
            System.out.println(((TrabajoPintura)o).toString());
            
        }
        else if(o instanceof RevisionAlarma){
            trabajador=leer("Inserte el nombre del trabajador");
            o.setTrabajador(trabajador);
            capturarFecha(o);
            cliente=leer("Inserte el  ombre del cliente");
            o.setCliente(cliente);
            nAlarmas=Integer.parseInt(leer("Inserte el numero de alarmas"));
            ((RevisionAlarma)o).setNumeroAlarmas(nAlarmas);
            System.out.println(((RevisionAlarma)o).toString());
        }
    }
}
