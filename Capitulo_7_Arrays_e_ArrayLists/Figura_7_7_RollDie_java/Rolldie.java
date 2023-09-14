/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 199
// Figura 7.7: RollDie.java
// Programa de jogo de dados utilizando arrays em vez de switch (Figura 6.7)
//Dice game program using arrays instead of switches (Figure 6.7)
(6.7) https://github.com/wfrsilva/exercicios_java_como_programar/tree/main/Capitulo_6_Metodos_exame_profundo/Figura_6_7_RollDie_java . */
package Figura_7_7_RollDie_java;

import java.security.SecureRandom;

public class Rolldie {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for (int roll = 1; roll <= 6000000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
        } // for

        System.out.printf("%s %10s %n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d %10d %n", face, frequency[face]);
        } // for

    }// main

}// Rolldie
