package arrays;

public class Array {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        //edades[3] = 5;
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento " + i + ": " + edades[i]);
            if (edades[i]==10) {
                System.out.println("Si imprime perritao");
            }
        }




        
    }
}

/*        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("frutas " + ren + "-" + col + ": " + frutas[ren][col]);
            }
        } */