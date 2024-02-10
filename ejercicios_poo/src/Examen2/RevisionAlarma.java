package Examen2;

public class RevisionAlarma extends Servicio {
    private int numeroAlarmas;

    public RevisionAlarma(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    public RevisionAlarma( String fechaInicio, String cliente, int numeroAlarmas) {
        super("Trabajador especialista contra incendios", fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    @Override
    public String toString() {
        return "RevisionAlarma "+super.toString()+ " [numeroAlarmas=" + numeroAlarmas + "]";
    }

    
    @Override
    public double costoMaterial(){
        double cm=0;
        
        return cm;
    }

    @Override
    public double costoManoObra(){
        double cmo=0;
        cmo=(numeroAlarmas/3)*40;
        return cmo;
    }
    
    @Override
    public double  costoTotal(){
        double ct=0;
        return ct=costoManoObra();
    }





}
