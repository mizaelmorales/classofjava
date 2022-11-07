package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Mizael", "Morales");
        System.out.println("Objeto :" + persona);
        System.out.println("Nombre : " + persona.nombre);
        System.out.println("Nombre : " + persona.apellido);
    }
}
/**
 * Persona
 */
class Persona {
    String nombre;
    String apellido;

    Persona( String nombre, String apellido){
        //super() -- llamada implicita al contrustuctor padre object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this" + this );
        new Imprimir().imprimir(this);
    }
}
class Imprimir {
    public void imprimir (Persona persona) {
        System.out.println("Objeto persona " + persona );
        System.out.println("Objeto usando this" + this );
    }
}
