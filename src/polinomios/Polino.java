/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomios;

/**
 *
 * @author Personal
 */
public class Polino {

    private Nodo cabeza;

    public Polino() {

        this.cabeza = null;

    }

    public void agregarTermino(int coeficiente, int exponente) {

        Nodo nuevoNodo = new Nodo(coeficiente, exponente);

        if (cabeza == null) {

            cabeza = nuevoNodo;

        } else if (exponente > cabeza.exponente) {

            nuevoNodo.siguiente = cabeza;

            cabeza = nuevoNodo;

        } else {

            Nodo anterior = null;

            Nodo actual = cabeza;

            while (actual != null && exponente <= actual.exponente) {

                if (exponente == actual.exponente) {

                    actual.coeficiente += coeficiente;

                    return;

                }

                anterior = actual;

                actual = actual.siguiente;

            }

            nuevoNodo.siguiente = actual;

            if (anterior != null) {

                anterior.siguiente = nuevoNodo;

            }

        }

    }

    public void imprimir() {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.coeficiente != 0) {

                System.out.print(actual.getCoeficiente() + "x^" + actual.exponente);

                if (actual.siguiente != null && actual.siguiente.exponente > 0) {

                    System.out.print(" + ");

                }

            }

            actual = actual.siguiente;

        }

        System.out.println();

    }

    public double evaluar(double x) {

        double resultado = 0.0;

        Nodo actual = cabeza;

        while (actual != null) {

            resultado += actual.coeficiente * Math.pow(x, actual.exponente);

            actual = actual.siguiente;

        }

        return resultado;

    }
}
