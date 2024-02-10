package ejercicio8v2;

public class Sucursal {
    private int numeroSucusrsal;
    private String direccion;
    private String ciudad;


    public Sucursal(int numeroSucusrsal, String direccion, String ciudad) {
        this.numeroSucusrsal = numeroSucusrsal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }


    public int getNumeroSucusrsal() {
        return numeroSucusrsal;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getCiudad() {
        return ciudad;
    }

    public String mostarDatos(){

        return("El numero de la sucusrsal es "+this.numeroSucusrsal+"\nLa direccion es "+this.direccion+
        "\nLa ciudad es "+this.ciudad);
    }

    public double calcularPrecio(Paquete t){
        double precio=t.getPeso();
        
        if(t.getPrioridad()==1){
            precio+=10;
        }
        else if(t.getPrioridad()==2){
            precio+=20;
        }
        return precio;
    }





    
}
