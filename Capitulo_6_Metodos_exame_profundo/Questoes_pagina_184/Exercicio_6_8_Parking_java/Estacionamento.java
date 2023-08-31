/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 186
// 6.8 (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. Um adicional
de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período
de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento
para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar
o método calculateCharges para determinar a tarifa para cada cliente. */
package Questoes_pagina_184.Exercicio_6_8_Parking_java;

import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double totalRecibo = 0;

        System.out.print("Digite o total de clientes: ");
        int numClientes = entrada.nextInt();

        for (int i = 1; i <= numClientes; i++) {
            System.out.print("Cliente " + i + " - Digite as horas de estacionamento: ");
            int horasEstacionado = entrada.nextInt();

            double tarifa = calcularTarifas(horasEstacionado);

            totalRecibo += tarifa;

            System.out.printf("Cliente %d: Tarifa de $ %.2f %n", i, tarifa);

        } // for

        System.out.printf("%n Total dos Recibos: $ %.2f %n", totalRecibo);

        entrada.close();

    }// main

    public static double calcularTarifas(int horas) {
        double tarifaMinima = 2.0;
        double tarifaMaxima = 10.0; // diaria
        double tarifaAdicional = 0.5;

        if (horas <= 3) {
            return tarifaMinima;
        } // if
        else if (horas < 24) {
            double horasAdicionais = horas - 3;
            double tarifaTotal = tarifaMinima + (horasAdicionais * tarifaAdicional);
            return Math.min(tarifaTotal, tarifaMaxima); // 20h ate 23h é mais caro que a diaria (24h)
        } // else if
        else {
            return tarifaMaxima;
        } // else

    }// calcularTarifas

}// Estacionamento
