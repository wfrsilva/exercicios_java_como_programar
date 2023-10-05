/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 235
7.12 (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse problema.
Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.*/
package Questoes_pagina_235.Exercicio_7_12_ArrayDuplicate_java;

import java.util.Scanner;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number;
        while (counter < 5) {
            boolean isDup = false;
            System.out.printf("%d/5 - Insert int (10 - 100): ", counter + 1);
            number = input.nextInt();
            if (number >= 10 && number <= 100) {

                for (int i = 0; i < array.length; i++) {
                    if (number == array[i]) {
                        isDup = true;
                    } // if
                } // for

                if (!isDup) {
                    array[counter] = number;
                    counter++;
                } // if

            } // if
        } // while

        System.out.println("\n\nFinal Array");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] - %d %n", i, array[i]);
        } // for

        input.close();

    }// main

}// ArrayDuplicate
