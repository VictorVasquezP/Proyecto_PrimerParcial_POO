/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ArrayVehiculo{
    private ArrayList<Vehiculo>autos;
    
    public ArrayVehiculo() {
        autos=new ArrayList<>();
    }
    public void add(Vehiculo veh){
        autos.add(veh);
    }
    public void placa(){     
        for(Vehiculo t:autos){
        System.out.print(t.getPlaca());
        System.out.print(" -> ");
        }
    }
    public void marca(){
        for(Vehiculo t:autos){
        System.out.print(t.getMarca());
        System.out.print(" -> ");
        }
    }
    public void modelo(){
        for(Vehiculo t:autos){
        System.out.print(t.getModelo());
        System.out.print(" -> ");
        }
    }
    public void impuesto(){
        for(Vehiculo t:autos){
        System.out.print(t.calcularTenencia());
        System.out.print(" -> ");
        }
    }
    public void datosG(){
        for(Vehiculo t:autos){
            System.out.println("El vehiculo de placa "+t.getPlaca()+" con N° serie: "+t.getNoSerie()+" de la marca "+t.getMarca()+" fue un modelo "+t.getModelo()+" con una Factura de de "+t.getValorFactura());
        }
    }
    public boolean compRepet(Vehiculo v){
        ArrayList<String>aux=new ArrayList<>();
        int a=0;
        boolean c=false;
        boolean b=false;
        boolean d=false;
        while(!d&&(a<autos.size())){
            aux.add(autos.get(a).getPlaca());
            aux.add(autos.get(a).getNoSerie());
            b=aux.contains(v.getPlaca());
            c=aux.contains(v.getNoSerie());
            d=b|c;
            a++;
        }
        return d;
    }
    public boolean agregar(Vehiculo v1){
        if(compRepet(v1)){
            return false;
        }else{
            return this.autos.add(v1);
        }
    }
}
