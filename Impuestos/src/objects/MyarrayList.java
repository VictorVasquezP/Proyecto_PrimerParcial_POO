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
public class MyarrayList extends ArrayList{
    public boolean add(Vehiculo vehiculo){
        //AQUI EL CONTEINT
        if(isRepetido(vehiculo)){
            return false;
        }else{
            return super.add(vehiculo);
        }
    }
    private Boolean isRepetido(Vehiculo vehiculo){
        boolean encontrado = false;
        int contador=0;
        while(!encontrado && contador < super.size()){
            encontrado = this.get(contador) == vehiculo.getPlaca();
        }
        return encontrado;
    }
}
