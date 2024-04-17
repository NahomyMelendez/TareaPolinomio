/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomios;

/**
 *
 * @author Personal
 */
public class Nodo {

    int coeficiente;
    int exponente;
    Nodo siguiente;

    public Nodo(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
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

    public Nodo getSiguiente() {

        return siguiente;

    }

    public void setSiguiente(Nodo siguiente) {

        this.siguiente = siguiente;

    }

}
