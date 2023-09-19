/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 203
// Figura 7.9: Card.java
// Classe Card representa uma carta de baralho.*/
package Figura_7_9_Card_java;

public class Card {

    private final String face; // face da carta ("Ace", "Deuce", ...)
    private final String suit; // naipe da carta ("Hearts", "Diamonds", ...)

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }// Constructor Card

    public String toString() {
        return face + " of " + suit;
    }// toString

}// Class Card
