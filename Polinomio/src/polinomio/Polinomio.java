/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomio;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Polinomio {
private ArrayList<Monomio>terminos;
//constructor
public Polinomio(){
 terminos=new ArrayList<Monomio>();   
}
 public void add(Monomio mono){
     terminos.add(mono);
 }   
 public void imprimir(){
     for(Monomio t:terminos){
         System.out.print(t);
     }
 }
 public void reducir(){
     ArrayList<Monomio>aux = new ArrayList<>();
     while(terminos.size()>0){
         Monomio actual = terminos.remove(0);
         int contador = 0;
         while(contador < terminos.size()){
             Monomio t = terminos.get(contador);
             if(actual.isSemejante(t)){
             actual.setCoeficiente(actual.getCoeficiente()+t.getCoeficiente());
             terminos.remove(contador);
             }else{
                 contador++;
             }
         }
         if(actual.getCoeficiente()!=0){
             aux.add(actual);
         }
     }
     terminos = aux;
     //public static void sumar(Polinomio p1, Polinomio p2){
       //  return new Polinomio();
     //}
 }
 //porque va a retornar un polinomio
 public static Polinomio sumar(Polinomio poli1, Polinomio poli2){
     poli1.reducir();
     poli2.reducir();
     int cont=0;
     int cont2=0;
     //creamos el Polinomio a retornar
     Polinomio nuevoSum = new Polinomio();
     for(Monomio t: poli1.terminos){
         nuevoSum.add(new Monomio(t.getCoeficiente(),t.getExponente()));
     }
     for(Monomio t: poli2.terminos){
         nuevoSum.add(new Monomio(t.getCoeficiente(),t.getExponente()));
     }
     nuevoSum.reducir();
     return nuevoSum;
 }
 public static Polinomio resta(Polinomio poli1, Polinomio poli2){
     poli1.reducir();
     poli2.reducir();
     int cont3=0;
     int cont4=0;
     //creamos el Polinomio a retornar
     Polinomio nuevoRest = new Polinomio();
     for(Monomio t: poli1.terminos){
         nuevoRest.add(new Monomio(t.getCoeficiente(),t.getExponente()));
     }
     for(Monomio t: poli2.terminos){
         nuevoRest.add(new Monomio(t.getCoeficiente()*-1,t.getExponente()));
     }
     nuevoRest.reducir();
     return nuevoRest;
 }
 public static Polinomio multiplicar(Polinomio p1, Polinomio p2){
     Polinomio multNew= new Polinomio();
     Integer contador=0;
     Integer contador2=0;
     while(contador<p1.terminos.size()){
         while(contador2<p2.terminos.size()){
             
             multNew.add(new Monomio(p1.terminos.get(contador).getCoeficiente()*
                     p2.terminos.get(contador2).getCoeficiente(),
                     p1.terminos.get(contador).getExponente()+
                     p2.terminos.get(contador2).getExponente()));
             contador2++;
         }
         contador2=0;
         contador++;
     }
     //simplificar
     multNew.reducir();
     return multNew;
 }
}
