/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 177
// Figura 6.10: MethodOverload.java
// Declarações de métodos sobrecarregados.
// Overloaded method declarations. */

package Figura_6_10_MethodOverload_java;

public class MethodOverload {

    public static void main(String[] args) {

        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));

    }// main

    public static int square(int intValue) {

        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;

    }// square

    public static double square(double doubleValue) {

        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;

    }// square

}// MethodOverload
