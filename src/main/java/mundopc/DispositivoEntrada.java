package mundopc;

public abstract class DispositivoEntrada {
    protected String tipoEntrada;
    protected String marca;
    
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    @Override
    public String toString() {
        String dataReturn = "PersonaStatico = {"+"tipoEntrada="+this.tipoEntrada+", marca="+this.marca+", "+ super.toString()+"}";;
        return dataReturn;
    }
}

