/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2patronesdiseno;

import subsistemas.*;

/**
 *
 * @author miguel
 */
public class AYD2PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ventana ven = new ventana();
        sistema_de_archivos sa = new sistema_de_archivos();
        procesador_texto pt = new procesador_texto();
        cola_de_impresion ci = new cola_de_impresion();
        
        CrearDocumentoFacade fa = new CrearDocumentoFacade(ven, sa, pt, ci);
        fa.verDocumento();
        
    }
    
}
