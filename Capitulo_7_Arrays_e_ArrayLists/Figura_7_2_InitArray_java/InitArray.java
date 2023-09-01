/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 195
// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrão de zero. */
//package Capitulo_7_Arrays_e_ArrayLists.Figura_7_2_InitArray_java;
package Figura_7_2_InitArray_java;

public class InitArray {

    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.printf("%s%8s %n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {

            System.out.printf("%5d%8d %n", counter, array[counter]);

        } // for

    }// main

}// InitArray
