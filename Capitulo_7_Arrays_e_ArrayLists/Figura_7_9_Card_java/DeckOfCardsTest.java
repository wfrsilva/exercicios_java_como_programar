/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 205
// Figura 7.11: DeckOfCardsTest.java
// Embaralhando e distribuindo cartas.*/
package Figura_7_9_Card_java;

public class DeckOfCardsTest {

    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            } // if

        } // for

    }// main

}// DeckOfCardsTest
