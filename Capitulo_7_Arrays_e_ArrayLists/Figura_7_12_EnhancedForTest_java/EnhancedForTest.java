/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 206
// Figura 7.12: EnhancedForTest.java
// Utilizando a instrução for aprimorada para somar inteiros em um array. */
package Figura_7_12_EnhancedForTest_java;

public class EnhancedForTest {

    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for (int number : array) {
            total += number;
        } // for

        System.out.printf("Total of array elements: %d %n", total);
    }// main

}// EnhancedForTest
