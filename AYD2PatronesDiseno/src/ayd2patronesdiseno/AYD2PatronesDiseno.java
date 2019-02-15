/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2patronesdiseno;

import Facade.EnsamblarComputadoraFacade;
import Iterator.Computadora;
import Iterator.ComputadorasIterator;
import Iterator.Fabrica;
import subsistemas.Ensamblaje;
import subsistemas.InstalarDrivers;
import subsistemas.InstalarSistemaOperativo;
import subsistemas.InstalarSoftwareOfimatica;

/**
 *
 * @author miguel
 */
public class AYD2PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //----------- Se crea una fabrica -----------
        Fabrica fab1 = new Fabrica("Fabrica1");
        //----------- Se producen elementos para varias computadoras -----------
        fab1.NuevaComputadora("PC1");
        fab1.NuevaComputadora("PC2");
        fab1.NuevaComputadora("PC3");
        fab1.NuevaComputadora("PC4");
        System.out.println(">>"+fab1.getName());
        /***
         * Luego de fabricar las computadoras 
         *  
         */
        ComputadorasIterator it= fab1.iterator();
        while(it.hasNext()){
            Computadora c = (Computadora)it.next();
            c.print();
            
            Ensamblaje en = new Ensamblaje();
            InstalarDrivers id = new InstalarDrivers();
            InstalarSistemaOperativo iso = new InstalarSistemaOperativo();
            InstalarSoftwareOfimatica ofi = new InstalarSoftwareOfimatica();

            EnsamblarComputadoraFacade cof = new EnsamblarComputadoraFacade(c,en, id, iso, ofi);
            cof.nuevoEnsamblajeWindows();
        }
        
            //----------- Se crea una fabrica -----------
        Fabrica fab2 = new Fabrica("Fabrica2");
        //----------- Se producen elementos para varias computadoras -----------
        fab2.NuevaComputadora("PC1");
        fab2.NuevaComputadora("PC2");
        fab2.NuevaComputadora("PC3");
        fab2.NuevaComputadora("PC4");
        System.out.println(">>"+fab2.getName());
        /***
         * Luego de fabricar las computadoras 
         *  
         */
        ComputadorasIterator it1= fab2.iterator();
        while(it1.hasNext()){
            Computadora c = (Computadora)it1.next();
            c.print();
            
            Ensamblaje en = new Ensamblaje();
            InstalarDrivers id = new InstalarDrivers();
            InstalarSistemaOperativo iso = new InstalarSistemaOperativo();
            InstalarSoftwareOfimatica ofi = new InstalarSoftwareOfimatica();

            EnsamblarComputadoraFacade cof = new EnsamblarComputadoraFacade(c,en, id, iso, ofi);
            cof.nuevoEnsamblajeLinux();
        }
        
    }
    
}
