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
//implements Comparable<PruebaPolin> para implementar el comparable con dos objetos
public class PruebaPolin {
   private ArrayList<Monomio>terminos;

public PruebaPolin(){
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
 public static Boolean isEqual(Monomio mono1, Monomio mono2){
     return mono1.getExponente()==mono2.getExponente();
 }
 //porque va a retornar un polinomio
 public static PruebaPolin sumar2(PruebaPolin poli1, PruebaPolin poli2){
     poli1.reducir();
     poli2.reducir();
     PruebaPolin aux2 = new PruebaPolin();
     for(Monomio t: poli1.terminos){
         aux2.add(new Monomio(t.getCoeficiente(),t.getExponente()));
     }
     for(Monomio t: poli2.terminos){
         aux2.add(new Monomio(t.getCoeficiente(),t.getExponente()));
     }
     aux2.reducir();
     return aux2;
 }
 //resta es igual 
 public static PruebaPolin multiplicar(PruebaPolin p1, PruebaPolin p2){
     PruebaPolin multNew= new PruebaPolin();
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

 public PruebaPolin division(PruebaPolin p1, PruebaPolin p2){
     PruebaPolin nuevoDiv = new PruebaPolin();
     
     
     
     return nuevoDiv;
 }
/*
    @Override
    public int compareTo(PruebaPolin p) {
        int cont=0;
        return terminos.get(cont++).getExponente();
    }
*/
}

