/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 180
// 6.1 Utilizando o método fillOval, desenhe um alvo que alterna entre duas cores aleatórias, como na Figura 6.13. Utilize o construtor
Color(int r, int g, int b) com argumentos aleatórios para gerar cores aleatórias. */
package Questoes_pagina_180;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Target extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillOval(0, 0, 300, 300);

        g.setColor(Color.GRAY);
        g.fillOval(25, 25, 250, 250);

        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);

        g.setColor(Color.GRAY);
        g.fillOval(75, 75, 150, 150);

        g.setColor(Color.GREEN);
        g.fillOval(100, 100, 100, 100);

        g.setColor(Color.GRAY);
        g.fillOval(125, 125, 50, 50);

    }// paintComponent

}// Target
