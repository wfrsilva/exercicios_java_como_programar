/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 162
// Figura 6.3: MaximumFinder.java
// Método maximum declarado pelo programador com três parâmetros double. 
// Maximum method declared by the programmer with three double parameters. */

package Figura_6_3_MaximumFinder_java;

import java.util.Scanner;

public class LocalizarMaximo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira tr\u00EAs valores de ponto flutuante separados por espa\u00E7os:");
        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double numero3 = entrada.nextDouble();

        double resultado = maximo(numero1, numero2, numero3);

        System.out.println("Maximo eh: " + resultado);

        entrada.close();

    }// main

    public static double maximo(double x, double y, double z) {
        double valorMaximo = x;

        if (y > valorMaximo) {
            valorMaximo = y;
        } // if

        if (z > valorMaximo) {
            valorMaximo = z;
        } // if

        return valorMaximo;

    }// maximo

}// LocalizarMaximo