package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class Trompeta extends InstrumentoMusical{
    public Trompeta(String nombre, String color, String tamanio){
        super(nombre, color, tamanio);
    }

    
    public String GenerarSonido(){
        return "SOL-SI-RE";
    }
}
