package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        var a = 10;
        var b = 2;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);
    }

    public static void miMetodo() {
        //la variable esta fuera del alcance del cual fue difinido
        //a = 10;
        System.out.println("Otro metodo");
    }
}
