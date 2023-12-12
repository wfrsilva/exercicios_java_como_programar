/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 275
Exercício do estudo de caso GUI e imagens gráficas
8.1 Estenda o programa das figuras 8.17 a 8.19 para desenhar aleatoriamente retângulos e ovais.
(...) 
A classe DrawPanel, que estende JPanel e trata a criação das formas, deve declarar três arrays, um para cada tipo de forma. O comprimento
de cada array deve ser um número aleatório entre 1 e 5. O construtor da classe DrawPanel preencherá cada um dos arrays com
formas de posição aleatória, tamanho, cor e preenchimento.
(...) */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_1;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;
    private MyRectangle[] rectangles;
    private MyOval[] ovals;

    public DrawPanel() {

        setBackground(Color.WHITE);

        // cria o array de linhas
        lines = new MyLine[1 + randomNumbers.nextInt(5)];

        for (int count = 0; count < lines.length; count++) {
            // cria linhas
            int x1 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1, y1, x2, y2, color);
        } // for

        // Cria o array de retangulos
        rectangles = new MyRectangle[1 + randomNumbers.nextInt(5)];

        for (int count = 0; count < rectangles.length; count++) {
            int x1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            boolean isFilled = randomNumbers.nextBoolean();

            rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, isFilled);
        } // for

        // Cria o array de ovais
        ovals = new MyOval[1 + randomNumbers.nextInt(5)];

        for (int count = 0; count < ovals.length; count++) {
            int x1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            boolean isFilled = randomNumbers.nextBoolean();

            ovals[count] = new MyOval(x1, y1, x2, y2, color, isFilled);
        } // for

    }// constructor

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // desenha as linhas
        for (MyLine line : lines) {
            line.draw(g);
        } // for

        // desenha os retangulos
        for (MyRectangle rectangle : rectangles) {
            rectangle.draw(g);
        } // for

        // desenha os ovais
        for (MyOval oval : ovals) {
            oval.draw(g);
        } // for

    }// paintComponent

}// DrawPanel
