package caja;

public class cajaWork {
    public static void main(String[] args) {
        
        Caja cajaObject2 = new Caja(3,2,6);

        var resultado = cajaObject2.calculateVolum();

        System.out.println("su resultado es :" + resultado );
    }
}
