package herencia;

import java.util.Date;

public class Clientes extends Person{
    private int idCliente;
    private Date fecha;
    private boolean vip;
    private static int contadorCliente;
    
    public Clientes() {
        
    }
    public Clientes(String nombre, char genero, int edad, String direccion) {
        super(nombre,genero,edad,direccion);
        this.idCliente = ++Clientes.contadorCliente;
        this.fecha = new Date();
        this.vip = false;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        String textReturn = "Producto = {"+"idCliente="+this.idCliente+", vip="+this.vip+", Fecha="+this.fecha+", NroMemoria="+super.toString()+"}";
        return textReturn;
    }


}
