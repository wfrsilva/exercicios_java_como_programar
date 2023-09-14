/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 198
// Figura 7.6: BarChart.java
// programa de impressão de gráfico de barras. */
package Figura_7_6_BarChart_java;

public class BarChart {

    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade distribution");

        for (int counter = 0; counter < array.length; counter++) {

            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } // if
            else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            } // else

            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            } // for

            System.out.println();

        } // for

    }// main

}// BarChart
