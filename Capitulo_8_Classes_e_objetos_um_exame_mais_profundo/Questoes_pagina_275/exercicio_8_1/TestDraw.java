/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 275
Exercício do estudo de caso GUI e imagens gráficas
8.1 Estenda o programa das figuras 8.17 a 8.19 para desenhar aleatoriamente retângulos e ovais.
(...)

// Criando um JFrame para exibir um DrawPanel.*/

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_1;

import javax.swing.JFrame;

public class TestDraw {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }// main

}// TestDraw
