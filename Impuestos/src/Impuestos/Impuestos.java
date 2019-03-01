/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impuestos;

import java.util.ArrayList;
import objects.ArrayVehiculo;
import objects.Camion;
import objects.Camioneta;
import objects.MyarrayList;
import objects.Particular;
import objects.Taxi;
import objects.Vehiculo;

/**
 *
 * @author Victor
 */
public class Impuestos {
    public static void main(String[] args){
        //entra al arreglo de vehiculos
        Particular particular = new Particular("TJK9","OW39EDE232","HONDA",2019,29000.0,5);
        //System.out.println(particular.calcularTenencia());
        
        //no entra porque es el mismo N°Serie
        Taxi taxi = new Taxi("TJK8","OW39EDE232","HONDA",2012,290000.0,5,10);
        
        
        //System.out.println(taxi.calcularTenencia());
        
        //no entra porque es el mismo N°serie
        Camioneta camioneta = new Camioneta("TJK7","OW39EDE232","HONDA",2012,290000.0,5,true);
         //no entra porque es el mismo N°serie
        Camion camion = new Camion("TJK9","OW39EDE232","HONDA",2012,290000.0,5,true,4);
         //no entra porque es el mismo N°serie
        Camion camion2 = new Camion("TJK9","OW39EDE232","HONDA",2012,290000.0,5,true,4);
        
        Taxi taxi2 = new Taxi("TJK2","OW39EDE232","BMW",2012,290000.0,5,10);
        
        Particular particular2 = new Particular("JHSD","WKISDKEI","NISSAN",2019,29000.0,5);
        
        Taxi taxi3 = new Taxi("TJK1","OW3E232","BMW",2012,290000.0,5,10);
        
        Particular particular3 = new Particular("JHSD","WKIRNFD","NISSAN",2019,29000.0,5);
        ArrayVehiculo autoss = new ArrayVehiculo();
        autoss.agregar(particular);
        autoss.agregar(taxi);
        autoss.agregar(camioneta);
        autoss.agregar(camion);
        autoss.agregar(camion2);
        autoss.agregar(taxi2);
        autoss.agregar(particular2);
        autoss.agregar(taxi3);
        autoss.agregar(particular3);
        System.out.println("\n\nListado por placa");
        autoss.placa();
        System.out.println("\n\nLista por marca");
        autoss.marca();
        System.out.println("\n\nLista por modelo");
        autoss.modelo();
        System.out.println("\n\nListado por impuesto");
        autoss.impuesto();
        System.out.println("\n");
        autoss.datosG();
        /*
        
        ArrayList<Vehiculo>vehiculos = new ArrayList<>();
        vehiculos.add(particular);
        vehiculos.add(taxi);
        vehiculos.add(camioneta);
        vehiculos.add(camion);
        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getPlaca());
        }
        */
    }
}
