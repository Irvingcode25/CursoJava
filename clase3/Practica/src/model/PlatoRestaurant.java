
package model;

import model.*;

public class PlatoRestaurant extends Producto {
    private String chef;
    
    public PlatoRestaurant(String nombre, String caracteristica, int cantidad, double precio, String chef) {
        super(nombre, caracteristica, cantidad, precio);
        this.chef=chef;
    }

    @Override
    public String toString() {
        return "PlatoRestaurant{" + "chef=" + chef + super.toString() + '}';
    }
        
}
