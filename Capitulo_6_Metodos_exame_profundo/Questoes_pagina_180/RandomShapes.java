/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 180
// 6.2 Crie um programa que desenhe 10 formas preenchidas aleatórias com cores aleatórias, posições e tamanhos (Figura 6.14). Method
paintComponent deve conter um loop que itera 10 vezes. Em cada iteração, o loop deve determinar se deve ser desenhado um retângulo
ou uma oval preenchida, criar uma cor aleatória e escolher as coordenadas e dimensões aleatoriamente. As coordenadas devem ser escolhidas
com base na largura e altura do painel. O comprimento dos lados deve estar limitado à metade da largura ou altura da janela. */
package Questoes_pagina_180;

import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RandomShapes extends JPanel {

    SecureRandom random = new SecureRandom();

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {

            Color rndColor = new Color(oneRGB(), oneRGB(), oneRGB());
            g.setColor(rndColor);

            if (isOval()) {
                g.fillOval(onePosition(), onePosition(), oneSize(), oneSize());
            } // if
            else {
                g.fillRect(onePosition(), onePosition(), oneSize(), oneSize());
            } // else

        } // for

    } // paintComponent

    public int oneRGB() {

        int rgb = random.nextInt(256);
        return rgb;

    }// oneRGB

    public int oneSize() {

        int size = random.nextInt(200);
        return size;

    }// oneSize

    public int onePosition() {

        int pos = random.nextInt(300);
        return pos;
    }// onePosition

    public boolean isOval() {

        Boolean isOval = random.nextBoolean();
        return isOval;

    }// isOval

}// RandomShapes
