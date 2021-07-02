
package packes;

/**
 *
 * @author Geovanny Zambrano
 */
public class Disco extends Multimedia{
    
    

    public Disco(String titulo, String autor, String formato, double precio, double duracion, String capacidad) {
        super(titulo, autor, formato, precio, duracion);
        
        this.capacidad = capacidad;
        
    }
    
    //toString
    @Override
    public String toString(){
        String txt = super.toString() + ", Capacidad: " + capacidad;
        return txt;
    }
    
    //metodos get y set

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getContador() {
        return contador;
    }
    
    //atributos
    private String capacidad;
    
    private static int contador;
    
}
