/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 169
// Figura 6.7: RollDie.java
// Rola um dado de seis lados 6.000.000 vezes.
// Roll a six-sided die 6,000,000 times. */
package Figura_6_7_RollDie_java;

import java.security.SecureRandom;

public class RolarDados {

    public static void main(String[] args) {

        SecureRandom numerosRandomicos = new SecureRandom();

        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        for (int rolar = 1; rolar <= 6000000; rolar++) {

            int face = 1 + numerosRandomicos.nextInt(6);

            switch (face) {
                case 1:
                    ++frequencia1;
                    break;

                case 2:
                    ++frequencia2;
                    break;

                case 3:
                    ++frequencia3;
                    break;

                case 4:
                    ++frequencia4;
                    break;

                case 5:
                    ++frequencia5;
                    break;

                case 6:
                    ++frequencia6;
                    break;

            }// switch

        } // for

        System.out.println("Face\tFrequencia");
        System.out.printf("1\t%d %n2\t%d %n3\t%d %n4\t%d %n5\t%d %n6\t%d %n",
                frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6);

    }// main

}// RolarDados
