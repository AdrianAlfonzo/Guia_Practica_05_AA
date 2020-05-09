package Ejercicio_3_TRES;

/**
 *
 * @author AA2020
 */
public class Fundacion extends Empresa{
    public String _fundadorFundacion;

    
    public Fundacion(String fundador, String nombre, String tipo, String anio) {
        super(nombre, tipo, anio);
        this._fundadorFundacion = fundador;
    }
    
    
    public String FraseFundacion(){
        return "#QuedateEnCasa";
    }
}
