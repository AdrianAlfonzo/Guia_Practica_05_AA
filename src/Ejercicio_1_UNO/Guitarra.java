package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class Guitarra extends InstrumentoMusical{
    public String _guitarraCuerdas;
    
    
    public Guitarra(String nombre, String color, String tamanio) {
        super(nombre, color, tamanio);
        this._guitarraCuerdas = "6";
    }
    
    
    public String GenerarSonido(){
    return "MI-SI-SOL-RE-LA-MI";
    }
}
