/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 169
// Figura 6.6: RandomIntegers.java
// Inteiros aleatórios deslocados e escalonados.
// Shifted and scaled random integers. */

package Figura_6_6_RandomIntegers_java;

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {

            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0) {
                System.out.println();
            } // if

        } // for

    }// main

}// RandomIntegers
