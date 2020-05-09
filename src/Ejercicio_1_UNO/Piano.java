package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class Piano extends InstrumentoMusical{
    public String _pianoTipo;

    
    public Piano(String tipo, String nombre, String color, String tamanio) {
        super(nombre, color, tamanio);
        this._pianoTipo = tipo;
    }
    
    
    public String GenerarSonido(){
    return "DO-MI#-SOL";
    }
}
