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
public class Taxi extends Pasajero {
    private Integer aniosConcesion;
    public Taxi(String placa, String noSerie, String marca, Integer modelo, Double valorFactura, Integer noPasajeros,Integer anios) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
        this.aniosConcesion=anios;
    }

    public Integer getAniosConcesion() {
        return aniosConcesion;
    }

    public void setAniosConcesion(Integer aniosConcesion) {
        this.aniosConcesion = aniosConcesion;
    }
    @Override
    public Double calcularTenencia(){
        //calcular tenencia del papa * (1+noPasajeros)
        return super.calcularTenencia()*(1+this.getNoPasajeros()/10.0);
    }
    
}
