package ejercicio1v2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float lado1,lado2;
        Cuadrilatero c1;

        lado1=Float.parseFloat(JOptionPane.showInputDialog("Inserte el lado 1"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Inserte el lado 2"));

        if(lado1==lado2){
             c1 = new Cuadrilatero(lado2);
        }
        else{
             c1 = new Cuadrilatero(lado1,lado2);
        }
        
        System.out.println("\n El area del cuadrilatero es "+c1.getArea());
        System.out.println("\n El perimetro  del cuadrilatero es "+c1.getPerimetro());




    }
}
