package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mizael", 3500.00, false);
        System.out.println(persona1.getNombre());
        persona1.setNombre("Luhenlla");
        System.out.println(persona1.getNombre());
    }
}