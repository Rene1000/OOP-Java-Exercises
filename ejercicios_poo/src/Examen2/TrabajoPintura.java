package Examen2;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double PrecioPintura;
    
    public TrabajoPintura(double superficie, double precioPintura) {
        this.superficie = superficie;
        PrecioPintura = precioPintura;
    }
    public TrabajoPintura(String trabajador, String fechaInicio, String cliente, double superficie,
            double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        PrecioPintura = precioPintura;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public double getPrecioPintura() {
        return PrecioPintura;
    }
    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }
    @Override
    public String toString() {
        return "TrabajoPintura "+super.toString()+" superficie=" + superficie + " PrecioPintura=" + PrecioPintura + "]";
    }

    @Override
    public double costoMaterial(){
        double cm=0;
        cm=(superficie/7.8)*PrecioPintura;
        return cm;
    }

    @Override
    public double costoManoObra(){
        double cmo=0;
        cmo=(superficie/10)*9.5;
        return cmo;
    }
    
    @Override
    public double  costoTotal(){
        double ct=0;
        ct=costoMaterial()+costoManoObra();
        if(superficie<50){
            ct=ct+(ct*.15);
        }
        return ct;
    }


}
