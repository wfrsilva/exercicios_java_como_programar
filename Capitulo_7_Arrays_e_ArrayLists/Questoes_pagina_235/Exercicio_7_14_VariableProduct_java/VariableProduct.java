/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 235
7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de 
uma série de inteiros que são passados para método product utilizando uma lista de argumentos 
de comprimento variável. 
Teste seu método com várias chamadas, cada uma com um número diferente de argumentos.*/
package Questoes_pagina_235.Exercicio_7_14_VariableProduct_java;

public class VariableProduct {

    public static int product(int... numbers) {
        int product = 1;

        for (int number : numbers) {
            product *= number;
        } // for

        return product;

    }// product

    public static void main(String[] args) {

        int result1 = product(2, 3, 4);
        System.out.println("Product 2, 3, 4: " + result1);

        int result2 = product(5, 6, 7, 8);
        System.out.println("Product 5, 6, 7, 8: " + result2);

        int result3 = product(1, 2, 3, 4, 5, 6);
        System.out.println("Product 1, 2, 3, 4, 5, 6:" + result3);

    }// main

}// VariableProduct
