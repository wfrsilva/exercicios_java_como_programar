/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 203
// Figura 7.9.1: Carta.java
// Classe Carta representa uma carta de baralho.
// Card Class represents a playing card.*/
package Figura_7_9_Card_java.Figura_7_9_1_Carta_java;

public class Carta {

    private final String face; // face da carta ("As", "Dois", "Tres" ...)
    private final String naipe; // naipe da carta ("Copas", "Espadas", ...)

    public Carta(String faceDaCarta, String naipeDaCarta) {
        this.face = faceDaCarta;
        this.naipe = naipeDaCarta;
    }// construtor Carta

    public String toString() {
        return face + " de " + naipe;
    }// toString

}// Carta
