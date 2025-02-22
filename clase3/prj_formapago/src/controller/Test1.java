
package controller;

import model.Efectivo;
import model.FormaPago;
import model.TarjetaCredito;
import model.Yape;


public class Test1 {
    
    static void pagar(FormaPago pago) {
        System.out.println("Forma de pago : "+ pago);
        if (pago instanceof TarjetaCredito) {
            System.out.println("Pedir el Nr de tarjeta y numero de cuotas");
         }else if(pago instanceof Yape) {
            System.out.println("Indicar numero de telefono");
        }
    }
    
    public static void main(String[] args) {
 
     FormaPago pago1= new Efectivo(150);
        pagar(pago1);
        
        pago1=new TarjetaCredito(529.9);
        pagar(pago1);
        
        pago1=new Yape(2.5);
        pagar(pago1);
    }
    // despues verificar el producto y poner a despacho
   
    
}
