/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polinomios;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Polinomios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos del polinomio: ");
        int m = scanner.nextInt();

        Polino polinomio = new Polino();

        for (int i = 0; i < m; i++) {
            System.out.print("Ingrese el coeficiente del término " + (i + 1) + ": ");
            int coeficiente = scanner.nextInt();

            System.out.print("Ingrese el exponente del término " + (i + 1) + ": ");
            int exponente = scanner.nextInt();

            polinomio.agregarTermino(coeficiente, exponente);
        }

        System.out.print("Polinomio: ");
        polinomio.imprimir();

        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x | f(x)");
        System.out.println("---------");

        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double valor = polinomio.evaluar(x);
            System.out.printf("%.1f | %.4f\n", x, valor);
        }
    }
}
