package Ejercicio_3_TRES;

/**
 *
 * @author AA2020
 */
public class Almacen extends Empresa{
    public int _cantidadArticulos;
    
    
    public Almacen(int cantidadArticulos, String nombre, String tipo, String anio) {
        super(nombre, tipo, anio);
        this._cantidadArticulos = cantidadArticulos;
    }
    
    
    public String Saludar(){
        return "Bienvenido, ¿que pasó, que va querer?";
    }
}
