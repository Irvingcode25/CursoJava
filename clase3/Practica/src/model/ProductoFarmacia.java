
package model;

import model.*;

public class ProductoFarmacia extends Producto {
    private int año_venc;

    public ProductoFarmacia(String nombre, String caracteristica, int cantidad, double precio, int año_venc) {
        super(nombre, caracteristica, cantidad, precio);
        this.año_venc=año_venc;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{ " + " a\u00f1o_venc= " + año_venc + super.toString() + '}';
    }
    
    
}
