
package model;
import model.*;

public class ProductoFerreteria extends Producto {
    private int año_fab;

    public ProductoFerreteria(String nombre, String caracteristica, int cantidad, double precio , int año_fab) {
        super(nombre, caracteristica, cantidad, precio);
        
        this.año_fab=año_fab;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "a\u00f1o_fab=" + año_fab + super.toString() + '}';
    }
    
    
    
}
