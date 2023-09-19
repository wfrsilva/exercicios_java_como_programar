/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 203
// Figura 7.10: DeckOfCards.java
// classe DeckOfCards representa um baralho.*/
package Figura_7_9_Card_java;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        } // for

    }// constructor DeckOfCards

    public void shuffle() {

        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {

            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        } // for

    }// shuffle

    public Card dealCard() {

        if (currentCard < deck.length) {
            return deck[currentCard++]; // retorna Card atual no array
        } // if
        else {
            return null; // retorna nulo para indicar que todos as Cards foram distribuídas
        } // else

    }// dealCard

}// DeckOfCards