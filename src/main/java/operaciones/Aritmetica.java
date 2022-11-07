package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor
    public  Aritmetica() {
        System.out.println("Ejecutando Constructor");
    }

    public  Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
    }

    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    } 
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
    
}
