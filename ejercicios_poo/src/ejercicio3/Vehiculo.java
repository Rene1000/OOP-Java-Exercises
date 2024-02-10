package ejercicio3;

public class Vehiculo{
    private String marca;
    private String modelo;
    private float precio;


    public Vehiculo(){
        this("audi","r8",3000000);
    }

    public Vehiculo(String marca, String modelo, float precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
    }
    
    public static float getPrecio(Vehiculo auto1,Vehiculo auto2,Vehiculo auto3,Vehiculo auto4,Vehiculo auto5){
        float menor=100000000;
        
        if(auto1.precio<menor){
            menor=auto1.precio;
        }
        if(auto2.precio<menor){
            menor=auto2.precio;
        }
        if(auto3.precio<menor){
            menor=auto3.precio;
        }
        if(auto4.precio<menor){
            menor=auto4.precio;
        }
        if(auto5.precio<menor){
            menor=auto5.precio;
        }
        return menor;
    }

    public static  String mostrarDatos(Vehiculo auto1,Vehiculo auto2,Vehiculo auto3,Vehiculo auto4,Vehiculo auto5){
        float menor=0;
        String mensaje="";
        menor=getPrecio(auto1, auto2, auto3, auto4, auto5);
        if(menor==auto1.precio){
            mensaje= ("El auto de menor precio es: "+auto1.marca+" su modelo es: "+auto1.modelo+" su precio es de: "
            +auto1.precio);
        }
        else if(menor==auto2.precio){
            mensaje= ("El auto de menor precio es: "+auto2.marca+" su modelo es: "+auto2.modelo+" su precio es de: "
            +auto2.precio);
        }
        
        else if(menor==auto3.precio){
            mensaje= ("El auto de menor precio es: "+auto3.marca+" su modelo es: "+auto3.modelo+" su precio es de: "
            +auto3.precio);
        }
        
        else if(menor==auto4.precio){
            mensaje= ("El auto de menor precio es: "+auto4.marca+" su modelo es: "+auto4.modelo+" su precio es de: "
            +auto4.precio);
        }
        
        else if(menor==auto5.precio){
            mensaje= ("El auto de menor precio es: "+auto5.marca+" su modelo es: "+auto5.modelo+" su precio es de: "
            +auto5.precio);
        }
        return mensaje;

    }

    
}