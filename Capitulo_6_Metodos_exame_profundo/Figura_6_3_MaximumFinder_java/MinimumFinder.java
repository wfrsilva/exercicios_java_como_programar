/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 162
// Inspirado na Figura 6.3: MaximumFinder.java -> Fazer com minimo
// Método Minimum declarado pelo programador com três parâmetros double. 
// Minimum method declared by the programmer with three double parameters. */

package Figura_6_3_MaximumFinder_java;

import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = minimum(number1, number2, number3);

        System.out.println("Minimum is: " + result);

        input.close();

    }// main

    public static double minimum(double x, double y, double z) {

        double minimumValue = x;

        if (y < minimumValue) {
            minimumValue = y;
        } // if

        if (z < minimumValue) {
            minimumValue = z;
        } // if

        return minimumValue;

    }// minimum

}// MinimumFinder