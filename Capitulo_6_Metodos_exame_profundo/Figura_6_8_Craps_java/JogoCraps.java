/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 171
// Figura 6.8: Craps.java
// A classe Craps simula o jogo de dados craps. Adaptando TREY para TERNO e demais nomes do Domino
// The Craps class simulates the craps dice game. */

package Figura_6_8_Craps_java;

import java.security.SecureRandom;

public class JogoCraps {

    private static final SecureRandom numerosRandomicos = new SecureRandom();

    private enum Status {
        CONTINUE, GANHOU, PERDEU
    };

    private static final int DUQUE = 2;
    private static final int TERNO = 3;
    private static final int SETE = 7;
    private static final int ONZE = 11;
    private static final int CARRETA = 12;

    public static void main(String[] args) {

        int meusPontos = 0;
        Status statusJogo;
        int somaDoDado = rolaDado();

        switch (somaDoDado) {

            case SETE: // ganha com 7 no primeiro lançamento
            case ONZE: // ganha com 11 no primeiro lançamento
                statusJogo = Status.GANHOU;
                break;

            case DUQUE: // perde com 2 no primeiro lançamento
            case TERNO: // perde com 3 no primeiro lançamento
            case CARRETA: // perde com 12 no primeiro lançamento
                statusJogo = Status.PERDEU;
                break;

            default:// não ganhou nem perdeu, portanto registra a pontuação
                statusJogo = Status.CONTINUE;
                meusPontos = somaDoDado; // informa a pontuação
                System.out.printf("Pontua\u00E7\u00E3o \u00E9 %d%n", meusPontos);
                break;

        }// switch

        while (statusJogo == Status.CONTINUE) {
            somaDoDado = rolaDado();

            if (somaDoDado == meusPontos) {
                statusJogo = Status.GANHOU;
            } // if
            else {
                if (somaDoDado == SETE) {
                    statusJogo = Status.PERDEU;
                } // if
            } // else

            if (statusJogo == Status.GANHOU) {
                System.out.println("Jogador venceu");
            } // if
            else {
                System.out.println("Jogador perdeu");
            } // else

        } // while

    }// main

    public static int rolaDado() {

        int dado1 = 1 + numerosRandomicos.nextInt(6);
        int dado2 = 1 + numerosRandomicos.nextInt(6);
        int soma = dado1 + dado2;

        System.out.printf("Jogador rolou %d + %d = %d%n", dado1, dado2, soma);

        return soma;

    }// rolaDado

}// JogoCraps
