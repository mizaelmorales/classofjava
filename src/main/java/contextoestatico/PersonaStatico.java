package contextoestatico;

public class PersonaStatico {
    private int idPersona;
    private String nombrePersona;
    public static int contadorPersonas;

    public PersonaStatico(String nombrePersona) {
        this.nombrePersona = nombrePersona;
        PersonaStatico.contadorPersonas++;
        this.idPersona = PersonaStatico.contadorPersonas;
    }

    public String getNombre() {
        return nombrePersona;
    }

    public void setNombre(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        PersonaStatico.contadorPersonas = contadorPersonas;
    }
    @Override
    public String toString() {
        String textReturn = "PersonaStatico{"+"idPersona="+idPersona+", nombrePersona="+nombrePersona+", contadorPersonas"+PersonaStatico.contadorPersonas+"}";
        return textReturn;
    }

}
