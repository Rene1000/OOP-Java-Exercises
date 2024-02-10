package tickets;

public abstract class Ticket{
    private double precio;
    private int numAsientos;
    private String funcion;

    public Ticket(){
        this(80.0,5,"Madagascar");
    }

    public Ticket(Double precio, int numAsientos, String funcion){
        this.precio=precio;
        this.numAsientos=numAsientos;
        this.funcion=funcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public abstract String imprimirTicket();


}