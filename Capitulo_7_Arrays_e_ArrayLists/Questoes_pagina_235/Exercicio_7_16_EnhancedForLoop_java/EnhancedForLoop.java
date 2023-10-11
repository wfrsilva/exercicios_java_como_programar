/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 235
7.16 (Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double
passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe Double para converter uma
String em um valor double.]*/
package Questoes_pagina_235.Exercicio_7_16_EnhancedForLoop_java;

public class EnhancedForLoop {

    public static void main(String[] args) {
        Double total = 0.0;

        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            for (String arg : args) {
                total += Double.parseDouble(arg);
            } // for
        } // if

        System.out.printf("%n Total : %.2f %n", total);

    }// main

}// EnhancedForLoop
