/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 162
// Inspirado na Figura 6.3: MaximumFinder.java -> Fazer com minimo
// Método Minimum declarado pelo programador com três parâmetros double. 
// Minimum method declared by the programmer with three double parameters. */

package Figura_6_3_MaximumFinder_java;

import java.util.Scanner;

public class LocalizarMinimo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira tr\u00EAs valores de ponto flutuante separados por espa\u00E7os:");

        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double numero3 = entrada.nextDouble();

        double result = minimo(numero1, numero2, numero3);

        System.out.println("Minimo \u00E9: " + result);

        entrada.close();

    }// main

    public static double minimo(double x, double y, double z) {

        double valorMinimo = x;

        if (y < valorMinimo) {
            valorMinimo = y;
        } // if

        if (z < valorMinimo) {
            valorMinimo = z;
        } // if

        return valorMinimo;

    }// minimum

}// LocalizarMinimo