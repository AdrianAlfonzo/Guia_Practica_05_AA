package Ejercicio_2_DOS;

/**
 *
 * @author AA2020
 */
public class Gerente extends Empleado{
   public int _gerenteAnios = 20;
   public Empleado _empleadoUno;
   public Empleado _empleadoDos;
   public Empleado _empleadoTres;
   
   
   public Gerente(){
   
   }
   
   
    public Gerente(Empleado empleadoUno,Empleado empleadoDos, Empleado empleadoTres, String nombre, String apellido, String DUI){
        super(nombre, apellido, DUI);
        this._empleadoUno = empleadoUno;
        this._empleadoDos = empleadoDos;
        this._empleadoTres = empleadoTres;
    }
}
