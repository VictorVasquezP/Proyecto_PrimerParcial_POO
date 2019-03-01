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
public abstract class Pasajero extends Vehiculo{
    private Integer noPasajeros;
    
    public Pasajero(String placa,
            String noSerie,
            String marca, 
            Integer modelo, 
            Double valorFactura,
            Integer noPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura);
        this.noPasajeros=noPasajeros;
    }

    public Integer getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(Integer noPasajeros) {
        this.noPasajeros = noPasajeros;
    }
    //implementar calcular tenencia
    //se hace la version de particular porque taxi lo sobreescribe
    @Override
    public Double calcularTenencia() {
        return this.getValorFactura()*calcularBaseGravable();
    }
    
    
}
