/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 223
// Figura 7.22: ArrayManipulations.java
// Métodos da classe Arrays e System.arraycopy.*/
package Figura_7_22_ArrayManipulations_java;

import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        } // for

        // preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // copia array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // verifica a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy %n", (b ? "==" : "!="));

        // verifica a igualdade de intArray e filledIntArray
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray %n", (b ? "==" : "!="));

        // pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("Found 5 at element %d int intArray %n", location);
        } // if
        else {
            System.out.println("5 not found int intArray");
        } // else

        // pesquisa o valor 8763 em intArray
        location = Arrays.binarySearch(intArray, 8763);

        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray %n", location);
        } // if
        else {
            System.out.println("8763 not found in intArray");
        } // else

    }// main

    // gera saída de valores em cada array
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        } // for

    }// displayArray

}// ArrayManipulations
