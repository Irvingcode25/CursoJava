
package controller;

import model.*;

public class Test {
    
    public static void main(String[] args) {
        model.ProductoFarmacia Pro =new ProductoFarmacia("Sabutamol ", " composicion 250 mg Sabutamol", 2 , 10, 2026);
        System.out.println(Pro);
        System.out.println("");
        
        model.ProductoFerreteria Fer=new ProductoFerreteria("Fierro", "Barrilla", 20, 56, 2025);
        System.out.println(Fer);
        System.out.println("");
        
        model.PlatoRestaurant pla= new PlatoRestaurant("Lomo Saltado", "Al jugo con Carne Argentina", 1 , 40 , "Juan Herencia");
        System.out.println(pla);
        System.out.println("");
    }
    
}
