/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;
import Iterator.Computadora;
import subsistemas.Ensamblaje;
import subsistemas.InstalarDrivers;
import subsistemas.InstalarSistemaOperativo;
import subsistemas.InstalarSoftwareOfimatica;

/**
 *
 * @author miguel
 */
public class EnsamblarComputadoraFacade {
    Ensamblaje en;
    InstalarDrivers id;
    InstalarSistemaOperativo iso;
    InstalarSoftwareOfimatica ofi;
    Computadora co;
    public EnsamblarComputadoraFacade(Computadora co, Ensamblaje en, InstalarDrivers id, InstalarSistemaOperativo iso,
        InstalarSoftwareOfimatica ofi){
        this.en = en;
        this.id = id;
        this.iso = iso;
        this.ofi = ofi;
        this.co = co;
    }
    
    public void nuevoEnsamblajeWindows(){
        en.ensamblar();
        en.testear();
        id.driverDiscoDuro();
        id.driverVideo();
        iso.instalarWindows();
        ofi.instalarOffice();
        System.out.print("Computadora WINDOWS lista, ");
        co.print();
        System.out.println("");
    }
    
     public void nuevoEnsamblajeLinux(){
        en.ensamblar();
        en.testear();
        id.driverDiscoDuro();
        id.driverVideo();
        iso.instalarLinux();
        ofi.instalarOffice();
          System.out.print("Computadora LINUX lista, ");
        co.print();
        System.out.println("");
    }
}
