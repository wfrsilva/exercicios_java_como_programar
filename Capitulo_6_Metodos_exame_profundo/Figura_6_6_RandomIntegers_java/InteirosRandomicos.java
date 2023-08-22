/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 169
// Figura 6.6: RandomIntegers.java
// Inteiros aleatórios deslocados e escalonados.
// Shifted and scaled random integers. */

package Figura_6_6_RandomIntegers_java;

import java.security.SecureRandom;

public class InteirosRandomicos {

    public static void main(String[] args) {

        SecureRandom numerosRandomicos = new SecureRandom();

        for (int contador = 1; contador <= 20; contador++) {

            int face = 1 + numerosRandomicos.nextInt(6);

            System.out.printf("%d ", face);

            if (contador % 5 == 0) {
                System.out.println();
            } // if

        } // for

    }// main

}// RandomIntegers
