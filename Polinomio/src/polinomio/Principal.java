/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomio;

import static polinomio.Polinomio.multiplicar;
import static polinomio.Polinomio.resta;
import static polinomio.Polinomio.sumar;
import static polinomio.PruebaPolin.sumar2;

/**
 *
 * @author Victor
 */
public class Principal {
    //metodo main es un metodo de clases por el static, se ejecuta antes de instanciar cualquier cosa
    public static void main(String[] args){
        
        Polinomio polinomio= new Polinomio();
        Polinomio polinomio2= new Polinomio();
        polinomio.add(new Monomio(2,2)); //2x^2
        polinomio.add(new Monomio(1,1));//x
        polinomio2.add(new Monomio(3,2));//3x^2
        polinomio2.add(new Monomio(1,1));//x
        polinomio2.add(new Monomio(2,3));//2x^3
        //polinomio= 2x^2 + x
        //polinomio2= 3x^2 + x + 2x^3
        System.out.println("Suma");
        sumar(polinomio, polinomio2).imprimir();
        System.out.println("\nResta");
        //polinomio1 - polinomio2
        resta(polinomio, polinomio2).imprimir();
        System.out.println("\nMultiplicacion");
        multiplicar(polinomio, polinomio2).imprimir();
        
        
        
        //suma(p)
        
      /*
        Monomio m2 = new Monomio(4,3);
        Monomio m1 = new Monomio(2,2);
        if(m1.isSemejante(m2)){
            System.out.println("Son iguales ");
        }else{
            System.out.println("No son");
        }
        
        PruebaPolin polinomio = new PruebaPolin();
        PruebaPolin polinomio2 = new PruebaPolin();
        polinomio.add(new Monomio(2,2));
        polinomio.add(new Monomio(1,1));
        polinomio.add(new Monomio(2,3));
        polinomio2.add(new Monomio(3,2));
        polinomio2.add(new Monomio(1,1));
        sumar2(polinomio,polinomio2).imprimir();
        */
    }
}
