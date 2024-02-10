package tickets;

public class Ticketvip extends Ticket {

    public Ticketvip() {
        super();
        setPrecio(80d);
    }

    public Ticketvip(int numAsientos, String funcion) {
        super(80d,8,"El rey leon");
    }
    
    @Override
    public String imprimirTicket(){
        return super.toString();
    }
    
}
