package mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
    super(tipoEntrada, marca);
    this.idRaton = ++contadorRaton;
    }

    @Override
    public String toString() {
        String dataReturn = "PersonaStatico = {"+"idRaton="+this.idRaton+", contadorRaton="+this.contadorRaton+", "+ super.toString()+"}";;
        return dataReturn;
    }
}
