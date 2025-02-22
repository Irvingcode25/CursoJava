
package model;

import model.*;

public class ProductoFarmacia extends Producto {
    private int a�o_venc;

    public ProductoFarmacia(String nombre, String caracteristica, int cantidad, double precio, int a�o_venc) {
        super(nombre, caracteristica, cantidad, precio);
        this.a�o_venc=a�o_venc;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{ " + " a\u00f1o_venc= " + a�o_venc + super.toString() + '}';
    }
    
    
}
