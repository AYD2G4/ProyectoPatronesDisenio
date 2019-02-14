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
public class CrearDocumentoFacade {
    ventana ven;
    sistema_de_archivos sa;
    procesador_texto pt;
    cola_de_impresion ci;
    public CrearDocumentoFacade(ventana ven, sistema_de_archivos sa, procesador_texto pt,
                                cola_de_impresion ci){
        this.ven = ven;
        this.sa = sa;
        this.pt = pt;
        this.ci = ci;
    }
    
    public void verDocumento(){
        ven.crearVentana();
        String ruta = "C://doc.docx";
        int descriptor = sa.abrir_archivo(ruta);
        sa.leer_archivo(ruta, 5, descriptor);
    }
    
    
}
