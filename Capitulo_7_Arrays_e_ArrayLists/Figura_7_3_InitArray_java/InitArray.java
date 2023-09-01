/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 196
// Figura 7.3: InitArray.java
// Inicializando os elementos de um array com um inicializador de array. */
package Figura_7_3_InitArray_java;

public class InitArray {

    public static void main(String[] args) {

        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

        System.out.printf("%s%8s %n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d %n", counter, array[counter]);
        } // for

    }// main

}// InitArray
