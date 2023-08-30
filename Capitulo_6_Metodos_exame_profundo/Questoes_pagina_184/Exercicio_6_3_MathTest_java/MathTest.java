// Exercício 6.3: MathTest.java
/*// Testando os métodos da classe Math
6.3 Escreva um aplicativo que teste se os exemplos de chamadas de método da classe Math mostrada na Figura 6.2 realmente produzem os
resultados indicados.  */
package Questoes_pagina_184.Exercicio_6_3_MathTest_java;

public class MathTest {

    public static void main(String[] args) {

        System.out.printf("Math.abs(23.7) = %f%n", Math.abs(23.7));
        System.out.printf("Math.abs(0.0) = %f%n", Math.abs(0.0));
        System.out.printf("Math.abs(-23.7)= %f%n", Math.abs(-23.7));
        System.out.printf("Math.ceil(9.2) = %f%n", Math.ceil(9.2));
        System.out.printf("Math.ceil(-9.8) = %f%n", Math.ceil(-9.8));
        System.out.printf("Math.cos(0.0) = %f%n", Math.cos(0.0));
        System.out.printf("Math.exp(1.0) = %f%n", Math.exp(1.0));
        System.out.printf("Math.exp(2.0) = %f%n", Math.exp(2.0));
        System.out.printf("Math.floor(9.2) = %f%n", Math.floor(9.2));
        System.out.printf("Math.floor(-9.8) = %f%n", Math.floor(-9.8));
        System.out.printf("Math.log(Math.E) = %f%n", Math.log(Math.E));
        System.out.printf("Math.log(Math.E) * Math.log(Math.E) = %f%n", Math.log(Math.E) * Math.log(Math.E));
        System.out.printf("Math.max(2.3, 12.7) = %f%n", Math.max(2.3, 12.7));
        System.out.printf("Math.max(-2.3, -2.7) = %f%n", Math.max(-2.3, -12.7));
        System.out.printf("Math.min(2.3, 12.7) = %f%n", Math.min(2.3, 12.7));
        System.out.printf("Math.min(-2.3, -12,7) = %f%n", Math.min(-2.3, -12.7));
        System.out.printf("Math.pow(2.0, 7.0) = %f%n", Math.pow(2.0, 7.0));
        System.out.printf("Math.pow(9.0, 0.5) = %f%n", Math.pow(9.0, 0.5));
        System.out.printf("Math.sin(0.0) = %f%n", Math.sin(0.0));
        System.out.printf("Math.sqrt(900.0) = %f%n", Math.sqrt(900.0));
        System.out.printf("Math.tan(0.0) = %f%n", Math.tan(0.0));

    }// main

}// MathTest
