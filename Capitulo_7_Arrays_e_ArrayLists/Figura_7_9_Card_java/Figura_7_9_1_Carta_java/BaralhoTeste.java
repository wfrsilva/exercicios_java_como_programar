/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 205
// Figura 7.11.1: BaralhoTeste.java
// Embaralhando e distribuindo cartas.
// Shuffling and dealing cards.*/
package Figura_7_9_Card_java.Figura_7_9_1_Carta_java;

public class BaralhoTeste {

    public static void main(String[] args) {

        Baralho meuBaralho = new Baralho();
        meuBaralho.embaralhar();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", meuBaralho.distribuirCarta());

            if (i % 4 == 0) {
                System.out.println();
            }
        } // for

    }// main

}// BaralhoTeste
