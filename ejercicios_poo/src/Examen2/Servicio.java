package Examen2;

public abstract class Servicio {
    private String trabajador;
    private String fechaInicio;
    private String cliente;

    public Servicio(){
        this("Herrero","09/03/2021","Pedro");
    }
    public Servicio(String trabajador, String fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }
    public String getTrabajador() {
        return trabajador;
    }
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Servicio [trabajador=" + trabajador + ", fechaInicio=" + fechaInicio + ", cliente=" + cliente + "]";
    }

    

    public abstract double costoMaterial();

    public abstract double costoManoObra();

    public abstract double costoTotal();
    







}
