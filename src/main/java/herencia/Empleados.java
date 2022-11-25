package herencia;

public class Empleados extends Person {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleados() {
        this.idEmpleado = ++Empleados.contadorEmpleado;
    }

    public Empleados(String nombre, double sueldo) {
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return Empleados.contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleados.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        String textReturn = "PersonaStatico{"+"idEmpleado="+this.idEmpleado+", Sueldo="+this.sueldo+", Nombre="+super.toString()+"}";
        return textReturn;
    }
}
