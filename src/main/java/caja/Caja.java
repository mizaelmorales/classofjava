package caja;

public class Caja {
    int alto;
    int ancho;
    int profundo;

    public Caja() {
        System.out.println("Ejecucion Contructor Vacio");
    }
    
    public Caja (int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int calculateVolum() {
        int vol;
        vol = (this.ancho * this.alto) * this.profundo;
        System.out.println("Calculo realizado");
        return vol;
    }
}