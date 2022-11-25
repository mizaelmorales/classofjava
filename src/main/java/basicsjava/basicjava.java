package basicsjava;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * basicjava
 */
public class basicjava {

    public static void main (String args []){
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificacion valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        //Cadena
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Hola Miza";
        System.out.println(miVariableCadena);
        
        //var Inferencia de tipos en Java
        var miVariableEntera2 = 2;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Hola Miza";
        System.out.println(miVariableCadena2);
        System.out.println("JOLÑA2");

        //Reglas de Variables 
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales

        System.out.println( miVariable + _miVariable + $miVariable);
        
        //array
       String listaArray[] = new String[1];
        var x= "A";
       listaArray[0]=x;
       System.out.println(listaArray[0]);
       ArrayList Names = new ArrayList();
       Names.add("hola");
       Names.add(5);
       System.out.println(Names.get(1));
       
       char array[] = {'a','b','c','e'};
       System.out.println(array[2]);
       
       var mizaa = Arrays.asList(x,2,3);
       mizaa.set(1,5);
       System.out.println(mizaa.get(2));

       var test = Names.get(1);
       System.out.println(test);

       String frutas[] = {"manzana","pera"};

       
    }
}