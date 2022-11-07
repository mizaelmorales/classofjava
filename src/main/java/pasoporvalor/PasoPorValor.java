package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);
    }

    public static void cambioValor(int argr1) {
        System.out.println(argr1);
        argr1 = 10;
    }
}
