
package packes;

/**
 *
 * @author HP
 */

public class Pelicula extends Multimedia{

    public Pelicula(String titulo, String autor, String formato, double precio, double duracion, String atriz) {
        super(titulo, autor, formato, precio, duracion);
        
        this.atriz = atriz;
        
    }
    
    //toString
    @Override
    public String toString(){
        String txt = (super.toString() + ", Atriz: " + atriz);
        return txt;
    }
    
    //metodos get y set
    public String getAtriz() {
        return atriz;
    }

    public void setAtriz(String atriz) {
        this.atriz = atriz;
    }
    
    //atributos
    private String atriz;
}
