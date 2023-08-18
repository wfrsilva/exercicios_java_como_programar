/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 162
// Figura 6.3: MaximumFinder.java
// Método maximum declarado pelo programador com três parâmetros double. 
// Maximum method declared by the programmer with three double parameters. */

package Figura_6_3_MaximumFinder_java;

import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);

        input.close();

    }// main

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        } // if

        if (z > maximumValue) {
            maximumValue = z;
        } // if

        return maximumValue;

    }// maximum

}// MaximumFinder