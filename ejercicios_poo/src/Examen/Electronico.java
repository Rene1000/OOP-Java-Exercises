package Examen;

public abstract class Electronico {
    private String tipo;
    private String marca;
    private double potencia;
    private int voltaje;
    private double precio;


    public Electronico() {
        this("lavadora","lg",2.6,200,299);
    }


    public Electronico(String tipo, String marca, double potencia, int voltaje, double precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
        this.voltaje = voltaje;
        this.precio = precio;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getPotencia() {
        return potencia;
    }


    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    public int getVoltaje() {
        return voltaje;
    }


    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return " tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + ", voltaje=" + voltaje
                + ", precio=" + precio +"\n";
    }

    
     public abstract double getConsumo(double horas);

     public abstract double getCostoConsumo(double horas,double CostoHora);

     public abstract double costoNominalMes(double horas);
     


}
