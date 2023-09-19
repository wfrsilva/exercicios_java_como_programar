/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 203
// Figura 7.10.1: Baralho.java 
// classe Baralho representa um baralho. Coletivo de Cartas = Baralho.
// class DeckOfCards represents a deck of cards.*/
package Figura_7_9_Card_java.Figura_7_9_1_Carta_java;

import java.security.SecureRandom;

public class Baralho {

    private Carta[] baralho;
    private int cartaAtual;
    private static final int NUMERO_DE_CARTAS = 52;

    private static final SecureRandom numerosRandomicos = new SecureRandom();

    public Baralho() {
        String[] faces = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete",
                "Dama", "Rei" };
        String[] naipes = { "Copas", "Espadas", "Ouros", "Paus" };

        baralho = new Carta[NUMERO_DE_CARTAS];
        cartaAtual = 0;

        for (int contador = 0; contador < baralho.length; contador++) {
            baralho[contador] = new Carta(faces[contador % 13], naipes[contador / 13]);
        } // for

    }// construtor Baralho

    public void embaralhar() {

        cartaAtual = 0;

        for (int primeiro = 0; primeiro < baralho.length; primeiro++) {

            int segundo = numerosRandomicos.nextInt(NUMERO_DE_CARTAS);

            Carta temp = baralho[primeiro];
            baralho[primeiro] = baralho[segundo];
            baralho[segundo] = temp;
        } // for

    }// embaralhar

    public Carta distribuirCarta() {
        // distribuir tambem pode ser comprar carta em alguams regioes
        if (cartaAtual < baralho.length) {
            return baralho[cartaAtual++];
        } // if
        else {
            return null; // retorna nulo para indicar que todos as Cartas foram distribuídas
        } // else

    }// distribuirCarta

}// Baralho
