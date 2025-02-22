
package model;
import model.*;

public class ProductoFerreteria extends Producto {
    private int a�o_fab;

    public ProductoFerreteria(String nombre, String caracteristica, int cantidad, double precio , int a�o_fab) {
        super(nombre, caracteristica, cantidad, precio);
        
        this.a�o_fab=a�o_fab;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "a\u00f1o_fab=" + a�o_fab + super.toString() + '}';
    }
    
    
    
}
