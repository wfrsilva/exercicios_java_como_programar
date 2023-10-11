/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 235
7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja especificado pelo primeiro argumento de
linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o tamanho padrão do array.*/
package Questoes_pagina_235.Exercicio_7_15_InitArrayArg_java;

public class InitArrayArg {

    public static void main(String[] args) {

        int[] array;

        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            int lenArray = Integer.parseInt(args[0]);
            array = new int[lenArray];
        } // if
        else {
            array = new int[10];
        } // else

        System.out.printf("%s%8s %n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d %n", counter, array[counter]);
        } // for

    }// main

}// InitArrayArg
