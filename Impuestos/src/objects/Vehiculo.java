/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Objects;

/**
 *
 * @author Victor
 */
public abstract class Vehiculo {
    private String placa;
    private String noSerie;
    private String marca;
    private Integer modelo;
    private Double valorFactura;

    public Vehiculo(String placa,
            String noSerie, 
            String marca, 
            Integer modelo, 
            Double valorFactura) {
        this.placa = placa;
        this.noSerie = noSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.valorFactura = valorFactura;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Vehiculo){
            Vehiculo v =(Vehiculo)obj;
            return this.getPlaca()==v.getPlaca();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.placa);
        return hash;
    }
    public abstract Double calcularTenencia();
    public Double calcularBaseGravable(){
        return this.modelo>=2009 ? 0.05 : 0.02;
    }
    public String getPlaca() {
        return placa;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public Double getValorFactura() {
        return valorFactura;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public void setValorFactura(Double valorFactura) {
        this.valorFactura = valorFactura;
    }
   
}
