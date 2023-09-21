/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 207
// Figura 7.13: PassArray.java
// Passando arrays e elementos do arrays individuais aos métodos.*/
package Figura_7_13_PassArray_java;

public class PassArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.printf("Effects of passingreference to entire array: %n" +
                "The values of the original array are: %n");

        for (int value : array) {
            System.out.printf("   %d", value);
        } // for

        modifyArray(array);

        System.out.printf("%n%n The values ofthe modified array are: %n");

        for (int value : array) {
            System.out.printf("   %d", value);
        } // for

        System.out.printf("%n%n Effects of passing array element value: %n" +
                "array[3] before modifyElement: %d %n", array[3]);

        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElement: %d %n", array[3]);

    }// main

    public static void modifyArray(int[] array2) {

        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        } // for

    }// modifyArray

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d %n", element);
    }// modifyElement

}// PassArray
