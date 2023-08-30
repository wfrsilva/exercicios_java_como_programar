// Exercício 6.6: Sphere.java
/* Calcula o volume de uma esfera.

Declare o método sphereVolume para calcular e retornar o volume da esfera. Utilize a seguinte instrução para calcular o volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, chama sphereVolume para calcular o volume
e exibe o resultado. 

Declare method sphereVolume to calculate and return the volume of the sphere. Use the following instruction to calculate the volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Write a Java application that prompts the user for the radius of type double of a sphere, calls sphereVolume to compute the volume
and displays the result. */
package Questoes_pagina_184.Exercicio_6_6_Sphere_java;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o raio da esfera: ");
        double raio = entrada.nextDouble();

        System.out.printf("O volume \u00E9 %f%n", volumeEsfera(raio));

    }// main

    public static double volumeEsfera(double raio) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;

    }// volumeEsfera

}// Esfera
