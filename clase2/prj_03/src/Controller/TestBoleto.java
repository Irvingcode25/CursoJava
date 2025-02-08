
package Controller;

import model.Boleto;

public class TestBoleto {
    public static void main(String[] args) {
        //una empresa vende boletos en todas sus oficinas
        //nivel nacional
        Boleto b1 =new Boleto("Lima","Trujillo") ;
        System.out.println(b1);
        Boleto b2 =new Boleto("ICA","AREQUIPA") ;
        System.out.println(b2);
        Boleto b3 = new Boleto("Tacna", "Moquegua");
        System.out.println(b3);
    }
}
