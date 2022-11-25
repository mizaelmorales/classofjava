package mundopc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
    super(tipoEntrada, marca);
    this.idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        String dataReturn = "PersonaStatico = {"+"idTeclado="+this.idTeclado+", contadorTeclado="+this.contadorTeclado+", "+ super.toString()+"}";;
        return dataReturn;
    }
}
