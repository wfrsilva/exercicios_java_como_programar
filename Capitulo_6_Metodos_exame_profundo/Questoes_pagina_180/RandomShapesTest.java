/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 180
// 6.2 Crie um programa que desenhe 10 formas preenchidas aleatórias com cores aleatórias, posições e tamanhos (Figura 6.14). Method
paintComponent deve conter um loop que itera 10 vezes. Em cada iteração, o loop deve determinar se deve ser desenhado um retângulo
ou uma oval preenchida, criar uma cor aleatória e escolher as coordenadas e dimensões aleatoriamente. As coordenadas devem ser escolhidas
com base na largura e altura do painel. O comprimento dos lados deve estar limitado à metade da largura ou altura da janela. */
package Questoes_pagina_180;

import javax.swing.JFrame;

public class RandomShapesTest {

    public static void main(String[] args) {
        RandomShapes panel = new RandomShapes();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 400);
        app.setVisible(true);

    }// main

}// RandomShapesTest
