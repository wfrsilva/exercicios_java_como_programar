
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 154 
//5.12 (Calculando o produto de números inteiros ímpares) 
Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.
5.12 (Calculating the product of odd integers)
Write an application that calculates the product of odd integers from 1 to 15.*/
package Exercicio_5_12_ProductOdds_java;

public class ProdutosImpares {

    public static void main(String[] args) {
        int resultado = 0;

        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d + %d = %d%n", i, resultado, (resultado + i));
                resultado = resultado + i;
            } // if
        } // for

        System.out.println("\nA soma dos impares de 1 a 15 é " + resultado);

    }// main

}// ProductOdds