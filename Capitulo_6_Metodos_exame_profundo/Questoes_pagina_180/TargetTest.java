/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 180
// 6.1 Utilizando o método fillOval, desenhe um alvo que alterna entre duas cores aleatórias, como na Figura 6.13. Utilize o construtor
Color(int r, int g, int b) com argumentos aleatórios para gerar cores aleatórias. */
package Questoes_pagina_180;

import javax.swing.JFrame;

public class TargetTest {

    public static void main(String[] args) {

        Target panel = new Target();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(350, 350);
        app.setVisible(true);

    }// main

}// TargetTest
