package Ejercicio_2_DOS;

/**
 *
 * @author AA2020
 */
public class Presidente extends Empleado{
    public Gerente _gerenteUno;
    public Gerente _gerenteDos;

    
    public Presidente(){
    
    }
    
    
    public Presidente(Gerente gerenteUno, Gerente gerenteDos, String nombre, String apellido, String DUI) {
        super(nombre, apellido, DUI);
        this._gerenteUno = gerenteUno;
        this._gerenteDos = gerenteDos;
    }
}
