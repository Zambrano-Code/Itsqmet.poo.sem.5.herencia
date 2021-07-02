/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosAyuda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Geovanny Zambrano
 */

public class mhelp {
    
    public static String txt() throws IOException{
        BufferedReader conTecl = new BufferedReader(new InputStreamReader(System.in));
        boolean repetir = false;
        String txt = null;
        do {
            txt = conTecl.readLine();
            if (txt == null || txt.equals("")) {
                repetir = true;
                System.out.println("No a ingresado ningun Dato. Intente de nuevo: ");
            }else{
                repetir = false;
            }
        } while (repetir);
        
        return txt;
        
    }
    
    public static int solicitarOpcionInt(int valores) throws IOException{
        int cantidadValor = Integer.toString(valores).length();
        int arrayOpciones [] = new int[cantidadValor];
        
        for (int i = 0; i < cantidadValor; i++) {
            char a = Integer.toString(valores).charAt(i);
            arrayOpciones[i] = Character.getNumericValue(a);
        }
        int a = -1;
        System.out.println("Escoja una opcion entre " + arrayOpciones[0] + " - " + arrayOpciones[arrayOpciones.length-1]);
        boolean repetir = true;
        boolean comparar = true;
        do {
            do {
                try {
                    a = Integer.parseInt(txt());
                }catch (NumberFormatException e){
                    System.out.println("El valor ingresado no es numero.");
                }
            } while (a == -1);
                        
            for (int b: arrayOpciones){
                if (a == b ) {
                    repetir = false;
                }
            }
            if (repetir) {                
                System.out.println("El valor ingresado no concide con las opciones.\nIntente de nuevo.");
            }
        } while (repetir);
               
        return a;
    }
    
    public static double numeroDouble() throws IOException{
        double num = 0;
        boolean repetir = false;
        do {
            try{
                num = Double.parseDouble(txt());
            }catch (NumberFormatException e){
                System.out.println("El valor ingresado no es un numero.\nIntenta de nuevo.");
                repetir = true;
            }
        } while (repetir);
        
        return num;
        
    }
    
}
