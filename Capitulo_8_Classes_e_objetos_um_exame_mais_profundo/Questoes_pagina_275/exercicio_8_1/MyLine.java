/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 273
// Figura 8.17: MyLine.java
// A classe MyLine representa uma linha. */
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_1;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public MyLine(int x1, int y1, int x2, int y2, Color color) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;

    }// constructor

    public void draw(Graphics g) {

        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);

    }// draw

}// MyLine
