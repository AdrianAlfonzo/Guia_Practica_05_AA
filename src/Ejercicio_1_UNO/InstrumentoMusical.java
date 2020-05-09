package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class InstrumentoMusical {
    private String _instrumentoNombre;
    private String _instrumentoColor;
    private String _instrumentoTamanio;
    
    
    public InstrumentoMusical(){
    
    }
    

    public InstrumentoMusical(String nombre, String color, String tamanio) {
        this._instrumentoNombre = nombre;
        this._instrumentoColor = color;
        this._instrumentoTamanio = tamanio;
    }


    public String GetNombreInstrumento() {
        return _instrumentoNombre;
    }
    public void SetNombreInstrumento(String nombre) {
        this._instrumentoNombre = nombre;
    }

    
    public String GetColorInstrumento() {
        return _instrumentoColor;
    }
    public void SetColorInstrumento(String color) {
        this._instrumentoColor = color;
    }

    
    public String GetTamanioInstrumento() {
        return _instrumentoTamanio;
    }
    public void SetInstrumentoTamanio(String tamanio) {
        this._instrumentoTamanio = tamanio;
    }
}
