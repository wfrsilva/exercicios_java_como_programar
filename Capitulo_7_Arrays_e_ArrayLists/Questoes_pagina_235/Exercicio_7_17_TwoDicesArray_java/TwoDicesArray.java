/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 235
7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de classe Random,
uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada
dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12,
as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.000.000
vezes. Utilize um array unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato
tabular.*/
package Questoes_pagina_235.Exercicio_7_17_TwoDicesArray_java;

import java.security.SecureRandom;

public class TwoDicesArray {

    public static void main(String[] args) {
        int diceOne;
        int diceTwo;
        int[][] frequency = new int[7][7];
        int[][] plusDices = new int[7][7];
        SecureRandom randonNumbers = new SecureRandom();

        for (int roll = 1; roll <= 6; roll++) {
            diceOne = 1 + randonNumbers.nextInt(6);
            diceTwo = 1 + randonNumbers.nextInt(6);
            ++frequency[diceOne][diceTwo];

            System.out.println("diceOne: " + diceOne + "\t diceTwo: " + diceTwo);
        } // for

        for (int r = 1; r < frequency.length; r++) {
            for (int c = 1; c < frequency[r].length; c++) {
                ++plusDices[r][c];
                if (r != c) {
                    ++plusDices[c][r];
                } // if
            } // for c
        } // for r

        System.out.println("---------- \n Many times dice 1 and dice 2 (1,6) != (6,1)");

        for (int r = 1; r < frequency.length; r++) {

            for (int c = 1; c < frequency[r].length; c++) {
                System.out.printf("[%d][%d]: %d \t", r, c, frequency[r][c]);
            } // for c

            System.out.println();

        } // for r

        System.out.println("---------- \n Many times dice 1 + dice 2 (1+6) == (6+1)");

        System.out.println("\t[1]\t[2]\t[3]\t[4]\t[5]\t[6]\t");
        for (int r = 1; r < plusDices.length; r++) {

            for (int c = 1; c < plusDices[r].length; c++) {
                if (c == 1) {
                    System.out.printf("[%d]\t", r);
                } // if

                System.out.printf("%d \t", plusDices[r][c]);

            } // for c

            System.out.println();

        } // for r

    }// main

}// TwoDicesArray
