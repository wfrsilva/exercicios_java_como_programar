/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 196
// Figura 7.5: SumArray.java
// Calculando a soma dos elementos de um array. */
package Figura_7_5_SumArray_java;

public class SumArray {

    public static void main(String[] args) {

        int[] array = { 87, 68, 94, 100, 83, 7, 85, 91, 76, 87 };
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total = total + array[counter]; // total += array[counter;]
        } // for

        System.out.printf("Total of array elements: %d %n", total);

    }// main

}// InitArray
