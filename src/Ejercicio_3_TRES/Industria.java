package Ejercicio_3_TRES;

/**
 *
 * @author AA2020
 */
public class Industria extends Empresa{
    public int _cantidadMaquinaria;

    
    public Industria(int cantidadMaquinaria, String nombre, String tipo, String anio) {
        super(nombre, tipo, anio);
        this._cantidadMaquinaria = cantidadMaquinaria;
    }
    
    
    public String Funcionando(){
        return "¡Enciendan motores, camaradas!";
    }
}
