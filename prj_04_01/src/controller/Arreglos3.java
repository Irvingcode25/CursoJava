
package controller;


public class Arreglos3 {
    
    public static void main(String[] args) {
        //crear un objeto de automovil
        model.Automovil veh1=new model.Automovil("AB1100", "KIA", 2005);
        System.out.println(veh1);        
        //crear un arreglo de automoviles
        int cantidad = 5;
        model.Automovil vehs []; // definir el arreglo
        
        //indicar la cantidad de vehiculos
        vehs =new model.Automovil[cantidad];
        
        
// inicializando con null , siempre tiene que inicializarse
        for (int i = 0; i < cantidad ; i++) {
            vehs[i]=null;
        }
        // mucho mas adelante se pueden usar 
        // asignando valor al elemento de indice 3 y 1
        vehs[3] =new model.Automovil("xxx", "volvo", 2020);
        vehs[1] =new model.Automovil("abc", "nissan", 2015);
        
        // mostrarlos
        System.out.println("LISTA DE VEHICULOS");
        
        for (int i = 0; i < cantidad; i++) {
            if (vehs[i] !=null) {
                System.out.println(vehs[i]);
            }
            
        }
    
    }
    
}
