/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 215
// Figura 7.17: InitArray.java
// Inicializando arrays bidimensionais.*/
package Figura_7_17_InitArray_java;

public class InitArray {

    public static void main(String[] args) {

        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.printf("%nValues in array2 by row are %n");
        outputArray(array2);

    }// main

    public static void outputArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            } // for

            System.out.println();

        } // for

    }// outputArray

}// InitArray
