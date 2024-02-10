package Examen;

public class Lavanderia extends Electronico {
    private boolean acaliente;
    private int diasLaborales;


    public Lavanderia(boolean acaliente, int diasLaborales) {
        this.acaliente = acaliente;
        this.diasLaborales = diasLaborales;
    }
    public Lavanderia(String tipo, String marca, double potencia, int voltaje, double precio, boolean acaliente,
            int diasLaborales) {
        super(tipo, marca, potencia, voltaje, precio);
        this.acaliente = acaliente;
        this.diasLaborales = diasLaborales;
    }
    public boolean getAcaliente() {
        return acaliente;
    }
    public void setAcaliente(boolean acaliente) {
        this.acaliente = acaliente;
    }
    public int getDiasLaborales() {
        return diasLaborales;
    }
    public void setDiasLaborales(int diasLaborales) {
        this.diasLaborales = diasLaborales;
    }
    @Override
    public String toString() {
        return "Lavanderia "+super.toString()+"acaliente=" + acaliente + ", diasLaborales=" + diasLaborales + "\n";
    }
    @Override
    public double getConsumo(double horas){
        double consumo=0;
        if(acaliente==false){
            consumo=horas*getPotencia();
        }else if(acaliente==true){
           consumo= horas*(getPotencia()+(getPotencia()*.20));
        }

        return consumo;
    }


    @Override
    public double getCostoConsumo(double horas,double costoHora){
        double costo=0;
        costo=costoNominalMes(horas)*costoHora;
        return costo;
    }

    @Override
    public double costoNominalMes(double horas){
        double costoN=0;
        if(getVoltaje()==120){
            costoN=getConsumo(horas)*diasLaborales;
        }else if(getVoltaje()==220){
            costoN=((getConsumo(horas)*diasLaborales)*.9);
        }
        return costoN;
    }
    
}
