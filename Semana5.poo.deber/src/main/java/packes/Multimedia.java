
package packes;

/**
 *
 * @author HP
 */
public class Multimedia {
    
    public Multimedia (String titulo, String autor, String formato, double precio, double duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.precio = precio;
        this.duracion = duracion;
    }
    //toString
    
    @Override
    public String toString(){
        String txt = ("Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Precio: " + precio + ", Duracion: ");
        return txt;
    }    
    //motodos get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    //atributos
    private String titulo;
    private String autor;
    private String formato; 
    private double precio;
    private double duracion;
    
}
