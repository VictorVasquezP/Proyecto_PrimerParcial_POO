/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomio;

/**
 *
 * @author Victor
 */
public class Monomio {
    private int coeficiente;
    private int exponente;
    //constantes por politica deben ser en mayusculas
    public static final char VARIABLE='x';
    //contructor
    public Monomio(int coeficiente, int exponente){
        this.coeficiente=coeficiente;
        this.exponente=exponente;
    }
    //set y get
    
    @Override
    public String toString(){
        //return String.format("%c%d%c^%d ", (coeficiente>0?'+':' '),coeficiente,VARIABLE,exponente);
        if(coeficiente>0){
            return String.format("+%d%c^%d ",coeficiente,VARIABLE,exponente);
        }else{
            return String.format("%d%c^%d ",coeficiente,VARIABLE,exponente);
        }
        
    }
    public int getCoeficiente() {
        return coeficiente;
    }
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }
    public int getExponente() {
        return exponente;
    }
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    public boolean isSemejante(Monomio otro){
        return this.getExponente() == otro.getExponente();
    }
}
