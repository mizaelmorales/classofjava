package trabajador;

public class Trabajador {
    private int idTrabajador;
    private String  nombre;
    private static int contadorTrabajador;

    public Trabajador(String nombre) {
        this.nombre = nombre;
        Trabajador.contadorTrabajador++;
        this.idTrabajador = Trabajador.contadorTrabajador;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }
    
    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorTrabajador() {
        return contadorTrabajador;
    }

    public static void setContadorTrabajador(int contadorTrabajador) {
        Trabajador.contadorTrabajador = contadorTrabajador;
    }
}
