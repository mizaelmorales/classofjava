package facturacion;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    public static int contadorProductos;

    private Producto() {
        idProducto = ++contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String textReturn = "PersonaStatico = {"+"nombre="+this.nombre+", precio="+this.precio+", "+super.toString()+"}";
        return textReturn;
    }
}
