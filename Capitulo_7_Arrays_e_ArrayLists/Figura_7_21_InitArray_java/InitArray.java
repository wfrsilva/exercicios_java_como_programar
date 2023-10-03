/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 222
// Figura 7.21: InitArray.java
// Inicializando um array com argumentos de linha de comando.*/
package Figura_7_21_InitArray_java;

public class InitArray {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.printf("Error: Please re-enter the entire command, including%n" +
                    "an array size, initial value and increment. %n");
        } // if
        else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            } // for

            System.out.printf("%s%8s %n", "Index", "value");

            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d %n", counter, array[counter]);
            } // for

        } // else

    }// main

}// InitArray
