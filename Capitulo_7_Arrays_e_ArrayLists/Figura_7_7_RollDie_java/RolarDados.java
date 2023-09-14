/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 199
// Figura 7.7: RollDie.java
// Programa de jogo de dados utilizando arrays em vez de switch (Figura 6.7)
//Dice game program using arrays instead of switches (Figure 6.7)
(6.7) https://github.com/wfrsilva/exercicios_java_como_programar/tree/main/Capitulo_6_Metodos_exame_profundo/Figura_6_7_RollDie_java . */
package Figura_7_7_RollDie_java;

import java.security.SecureRandom;

public class RolarDados {

    public static void main(String[] args) {

        SecureRandom numerosRandomicos = new SecureRandom();
        int[] frequencia = new int[7];

        for (int rolar = 1; rolar <= 6000000; rolar++) {
            ++frequencia[1 + numerosRandomicos.nextInt(6)];
        } // for

        System.out.printf("%s %10s %n", "Face", "Frequencia");

        for (int face = 1; face < frequencia.length; face++) {
            System.out.printf("%4d %10d %n", face, frequencia[face]);
        } // for

    }// main

}// RolarDados
