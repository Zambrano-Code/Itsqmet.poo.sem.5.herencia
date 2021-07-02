
package packes;

import java.io.IOException;
import metodosAyuda.mhelp;

/**
 *
 * @author Geovanny Zambrano
 */
public class main {
    public static void main(String[] args) throws IOException {
        
        Disco discos [] = new Disco[10];
        Pelicula peliculas [] = new Pelicula[10];
        
        int a = 0;
        int b = 0;
        
        while(true){
            int opcion = menu();
            switch(opcion){
                case 1:
                    if (a < 10 ) {
                        discos[a] = pedirDisco();
                        a++;
                    }else{
                        System.out.println("Ya no puedes agregar mas discos");
                    }
                    break;
                case 2:
                    if (a < 10) {
                        peliculas[b] = pedirPelicula();
                        b++;
                    }else{
                        System.out.println("Ya no puedes agregar mas peliculas");
                    }
                    break;
                case 3:
                    verDiscos(discos);
                    break;
                case 4:
                    verPeliculas(peliculas);
                    break;
                case 5: 
                    salir();
                    break;
            }
        }
    }
    
    private static int menu() throws IOException{
        System.out.println("--------** Menu Principal **-----------");
        System.out.println(" 1. Agregar disco.");
        System.out.println(" 2. Agregar pelicula.");
        System.out.println(" 3. Ver discos.");
        System.out.println(" 4. Ver peliculas.");
        System.out.println(" 5. Salir.");
        System.out.println("---------------------------------------");
        int a = mhelp.solicitarOpcionInt(12345);
        return a;
    }
    
    //-------- Peticiones Menu ----------
    
    private static Disco pedirDisco() throws IOException{
        System.out.println("----------Agrega Datos de disco------------");
        Disco tem = new Disco(pedirTitulo(), pedirAutor(), pedirFormato(), pedirPrecio(), pedirDuracion(), pedirCapacidad());
        return tem;
    }
    
    private static Pelicula pedirPelicula() throws IOException{
        System.out.println("----------Agrega Datos de Peliculas------------");
        Pelicula tem = new Pelicula(pedirTitulo(), pedirAutor(), pedirFormato(), pedirPrecio(), pedirDuracion(), pedirAtriz());
        return tem;
    }
    
    private static void verDiscos(Disco [] discos){
        for(Disco a: discos){
            try{
                System.out.println(a.toString());
            }catch(Exception e){
                System.out.println("Vacio...");
            }
        }
    }
    
    private static void verPeliculas(Pelicula [] peliculas){
        for(Pelicula a: peliculas){
            try{
                System.out.println(a.toString());
            }catch(Exception e){
                System.out.println("Vacio...");
            }
        }
    }
    
    private static void salir(){
        System.out.println("Saliendo....");
        System.exit(0);
    }
    
    //----------Peticiones clases--------------
    private static String pedirTitulo() throws IOException{
        System.out.println("Ingresa el titulo.");
        String txt = mhelp.txt();
        return txt;
        
    }
    private static String pedirAutor() throws IOException{
        System.out.println("Ingresa el autor.");
        String txt = mhelp.txt();
        return txt;
        
    }
    private static String pedirFormato() throws IOException{
        System.out.println("Ingresa el formato.");
        String txt = mhelp.txt();
        return txt;
        
    }
    private static double pedirPrecio() throws IOException{
        System.out.println("Ingresa el precio.");
        double num = mhelp.numeroDouble();
        return num;
        
    }
    private static double pedirDuracion() throws IOException{
        System.out.println("Ingresa la duracion.");
        double num = mhelp.numeroDouble();
        return num;
        
    }
    private static String pedirAtriz() throws IOException{
        System.out.println("Ingresa el atriz o autor principal.");
        String txt = mhelp.txt();
        return txt;
        
    }
    private static String pedirCapacidad() throws IOException{
        System.out.println("Ingresa la capacidad.");
        String txt = mhelp.txt();
        return txt;
        
    }
}
