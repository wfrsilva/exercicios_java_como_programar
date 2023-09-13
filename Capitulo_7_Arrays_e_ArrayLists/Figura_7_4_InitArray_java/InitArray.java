/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 196
// Figura 7.4: InitArray.java
// Calculando os valores a serem colocados nos elementos de um array. */
package Figura_7_4_InitArray_java;

public class InitArray {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        } // for

        System.out.printf("%s %8s %n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d %8d %n", counter, array[counter]);
        }

    }// main

}// InitArray
