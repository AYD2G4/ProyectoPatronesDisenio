/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;


import ayd2patronesdiseno.interfaces1.*;
import java.util.ArrayList;
import subsistemas.*;
import perifericos.*;
/**
 *
 * @author miguel
 */

public class SistemaData implements Interfaces1 {    
    private ArrayList observers;
    private ﬂoat temperature;    
    private ﬂoat humidity;    
    private ﬂoat pressure;        
    public SistemaData() {        
        observers = new ArrayList();    
    }        
    public void registerObserver(Observer o) {
        observers.add(o);    
    }
    public void removeObserver(Observer o) {        
        int i = observers.indexOf(o);        
            if (i >= 0) {            
                observers.remove(i);        
            }    
    }        
    public void notifyObservers() {        
        for (int i = 0; i < observers.size(); i++) {            
            Observer observer = (Observer)observers.get(i); 
            observer.update(temperature, humidity, pressure);        
        }    
    }        
    public void measurementsChanged() {        
        notifyObservers();    
    }        
    public void setMeasurements(ﬂoat temperature, ﬂoat humidity, ﬂoat pressure) 
    {        this.temperature = temperature;        
             this.humidity = humidity;        
             this.pressure = pressure;        
             measurementsChanged();    
    }        // other WeatherData methods here }

}
