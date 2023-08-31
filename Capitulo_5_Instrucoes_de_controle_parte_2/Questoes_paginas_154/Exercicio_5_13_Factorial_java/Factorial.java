package Exercicio_5_13_Factorial_java;
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 154 
//5.13 (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado
como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais
de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?
//5.13 (Factorials) Factorials are often used in probability problems. The factorial of a positive integer n (written as n! and pronounced
as “factorial of n”) is equal to the product of the positive integers from 1 to n. Write an app that calculates factorials
from 1 to 20. Use the long type. Display results in tabular format. What difficulty might prevent you from calculating the factorial of 100?*/

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Number \t Factorial");
        System.out.println("--------------------");

        for (int i = 1; i <= 20; i++) {
            long numberFactorial = calculateFactorial(i);
            System.out.printf("%d \t %d \n", i, numberFactorial);
        } // for

    }// main

    private static long calculateFactorial(int nmb) {

        if (nmb == 0 || nmb == 1) {
            return 1;
        } // if
        else {

            long factorial = 1;
            for (int i = 2; i <= nmb; i++) {
                factorial = i * factorial;
            }

            return factorial;

        } // else

    }// calculateFactorial

}// Factorial