package tickets;


public class Ticketnormal extends Ticket{

    public Ticketnormal() {
        super();
        setPrecio(34);
    }

    public Ticketnormal( int numAsientos, String funcion) {
        super(34d, numAsientos, funcion);
    }

    @Override
   public String imprimirTicket(){
        return super.toString();
   }


}