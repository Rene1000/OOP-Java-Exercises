package Examen;

public class Clima extends Electronico {
    private boolean aCaliente;
    private int diasLaborales;
    private int metros;

    public Clima(boolean aCaliente, int diasLaborales, int metros) {
        this.aCaliente = aCaliente;
        this.diasLaborales = diasLaborales;
        this.metros = metros;
    }
    public Clima(String tipo, String marca, double potencia, int voltaje, double precio, boolean aCaliente,
            int diasLaborales, int metros) {
        super(tipo, marca, potencia, voltaje, precio);
        this.aCaliente = aCaliente;
        this.diasLaborales = diasLaborales;
        this.metros = metros;
    }
    public boolean isaCaliente() {
        return aCaliente;
    }
    public void setaCaliente(boolean aCaliente) {
        this.aCaliente = aCaliente;
    }
    public int getDiasLaborales() {
        return diasLaborales;
    }
    public void setDiasLaborales(int diasLaborales) {
        this.diasLaborales = diasLaborales;
    }
    public int getMetros() {
        return metros;
    }
    public void setMetros(int metros) {
        this.metros = metros;
    }
    @Override
    public String toString() {
        return "Clima"+super.toString()+" aCaliente=" + aCaliente + ", diasLaborales=" + diasLaborales + ", metros=" + metros + "\n";
    }
    
    @Override
    public double getConsumo(double horas){
        double consumo=0;
       if(aCaliente==false){
        consumo=horas*getPotencia();
        if(getVoltaje()==120){
            consumo=consumo+(consumo*.10);
        }else if(getVoltaje()==220){
            consumo=consumo+(consumo*0.05);
        }

       }else if(aCaliente==true){
        consumo=horas*(getPotencia()+(getPotencia()*0.20));
        if(getVoltaje()==120){
            consumo=consumo+(consumo*.10);
        }else if(getVoltaje()==220){
            consumo=consumo+(consumo*0.05);
        }

       }
        return consumo;
    }


    @Override
    public double getCostoConsumo(double horas,double costoHora){
        double costo=0;
        if(metros<100){
           costoHora=costoHora+(costoHora*0.05);
        }
        costo=costoNominalMes(horas)*costoHora;
        return costo;
    }

    @Override
    public double costoNominalMes(double horas){
        int diasFestivos=30-diasLaborales;
        double costoN=0;
        if(getVoltaje()==120){
            costoN=(getConsumo(horas)*diasLaborales)+(diasFestivos*8);
        }else if(getVoltaje()==220){
            costoN=((getConsumo(horas)*diasLaborales)+(diasFestivos*8)*.9);
        }

        
        return costoN;
    }
    




}
