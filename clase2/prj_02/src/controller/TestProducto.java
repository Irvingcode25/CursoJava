
package controller;
 import model.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto p1 =new Producto(1234, "GALLETAS DEL NORTE", 3.5 , 150);
        //MOSTRAR P1
        Producto p2 =new Producto(1111, "Leche Gloria");
        //MOSTRAR P2
        // no ingresamos nada , lo dejamos en blanco los valores
        Producto p3=new Producto();
        System.out.println("p1 es " +p1);
        System.out.println("p2 es " +p2);
        System.out.println("p3 es " +p3);
        
        //PRUEBA DE NEGOCIO
        // PARA VENDER EL PRODUCTO: DEBE TENER STOCK , tener precio ,debe tener codigo
//        if(p1.getStock()>0){
//            System.out.println("El producto " +p1.getNombre() + " Se puede Vender");
//        
//        }else {
//             System.out.println("El producto " +p1.getNombre() + " NO SE PUEDE VENDER");
//        }
//        if(p2.getStock()>0){
//            System.out.println("El producto " +p2.getNombre() + " Se puede Vender");
//        
//        }else {
//                System.out.println("El producto " +p2.getNombre() + " NO SE PUEDE VENDER");
//        }
        if(p1.EsVendible()){
            System.out.println("El producto "+p1.getNombre()+" es vendible");
        }
        //comparar un objeto con otro
        if(p1.equals(p2)){
            System.out.println(p1.getNombre()+ " es igual a " + p2.getNombre());
        }else {
             System.out.println(p1.getNombre()+ " es diferente a " + p2.getNombre());
        }
        //COMPARACION POR ATRIBUTOS
        Producto p4 = new Producto(11111, "Leche Gloria");
        if(p1.equals(p4)){
            System.out.println(p2.getNombre()+ " es igual a " + p4.getNombre());
        }else {
             System.out.println(p2.getNombre()+ " es diferente a " + p4.getNombre());
        }
        
        //COMPARACION POR SUS VALORES HASHs
        if(p1.hashCode()== p2.hashCode()){
            System.out.println(p1.getNombre()+ " es igual a " + p2.getNombre());
        }else {
             System.out.println(p1.getNombre()+ " es diferente a " + p2.getNombre());
        }
        
        
    }
}
