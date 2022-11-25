package test;

import herencia.*;

public class HerenciaPrueba {
    public static void main(String[] args){
        Empleados empleado1 = new Empleados("Mizael Morales",3500);
        empleado1.setEdad(30);
        System.out.println("Empleado: "+ empleado1);

        Clientes cliente1 = new Clientes("Luhenlla Gomez", 'F' , 32, "Lima Santa Anita");

        System.out.println("Cliente: "+ cliente1);
    }
}
