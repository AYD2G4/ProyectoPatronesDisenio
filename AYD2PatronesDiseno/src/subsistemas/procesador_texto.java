/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistemas;

/**
 *
 * @author miguel
 */
public class procesador_texto {
    public void insertarPalabra(String ruta, String texto, int des){
        System.out.println("Insertando "+texto+" en "+ruta+".");
    }
    public void borrarPalabra(String ruta, int cantidad, int des){
        System.out.println("Borrando "+cantidad+" caracteres, en "+ruta+".");
    }
    public void negrita(String ruta, String texto, int des){
        System.out.println("Poniendo en negrilla "+texto+" en "+ruta+".");
    }
}
