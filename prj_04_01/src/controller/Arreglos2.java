
package controller;


public class Arreglos2 {
    
    public static void main(String[] args) {
        double precios []; // definicion de que la variable precios
          precios =new double[5]; // se disponga un espacio para 5 doubles
          
        precios[0]=25.5*1.1; // asignar un valor a la posicion cero de precios
        precios[1]=198.9*1.1;
        precios[2]=45.50*1.1;
        precios[3]=25.5*1.1;
        precios[4]=1999.90*1.1;
       
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Precio1 es "+precios[i] +" , IGV es " + precios[i]*.18);
        }
        
//        System.out.println("Precio 1 es "+precios[0]);
//        System.out.println("Precio 2 es "+precios[1]);
//        System.out.println("Precio 3 es "+precios[2]);
//        System.out.println("Precio 4 es "+precios[3]);
//        System.out.println("Precio 5 es "+precios[4]);       
    }
}
