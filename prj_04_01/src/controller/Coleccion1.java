
package controller;
// debo importar para realizar mi coleccion
import java.util.ArrayList;
import model.*;

public class Coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1= new ArrayList();
        //guardar elementos
        //colec
        colec1.add(3.14); // numero
        colec1.add("Juan"); // texto
        colec1.add(2025); // entero
        colec1.add(new Automovil("ABC-55", "toyota", 2024)); // Unca Clase
        colec1.add(new Automovil("BCS-00", "nissan", 2005));
        colec1.add(new Conductor("123", "Profesional", "Abel Abad"));
        colec1.add("Ultimo Elemento");
        
        // ya se guardar , ahora recuperar y mostrar cada elemento
        // ahora de los vehiculos solo mostrar la placa
        for (Object e :colec1) { // estoy creando un objeto e y de ahi recuperare los datos
            // se obtiene cada objeto
           // System.out.println(e); // mostramos en bruto cada objeto como se guardo
            // solo del automovil solo mostraremos la placa
            // si buscas una placa en especifico , debo poner la espeficacion
            // y para indixe debo poner i
            if (e instanceof Automovil) { // se usa en la serializacion 
                System.out.println(((Automovil)e).getPlaca());// esto es un cas
            }else{
                System.out.println(e);
            }
            
            
        }
    }
        
}
