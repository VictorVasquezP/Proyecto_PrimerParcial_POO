/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Victor
 */
public class Particular extends Pasajero {
    
    public Particular(String placa,
                      String noSerie,
                      String marca, 
                      Integer modelo, 
                      Double valorFactura, 
                      Integer noPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
    }
    
}
