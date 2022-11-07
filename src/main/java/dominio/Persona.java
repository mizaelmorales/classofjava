package dominio;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona (String nombre,double sueldo,boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString() {
        return  "Persona  [ Nombre : " + this.nombre + ", Sueldo" + this.sueldo;
    }

}
