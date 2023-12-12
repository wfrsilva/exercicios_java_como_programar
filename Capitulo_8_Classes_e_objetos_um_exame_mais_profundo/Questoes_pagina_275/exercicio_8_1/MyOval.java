/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 275
Exercício do estudo de caso GUI e imagens gráficas
8.1 Estenda o programa das figuras 8.17 a 8.19 para desenhar aleatoriamente retângulos e ovais. Crie as classes MyRectangle e MyOval.
Essas duas classes devem incluir as coordenadas x1, y1, x2, y2, uma cor e um flag boolean para determinar se a forma é preenchida.
Declare um construtor em cada classe com argumentos para inicializar todas as variáveis de instância. Para ajudar a desenhar retângulos e
ovais, cada classe deve fornecer os métodos getUpperLeftX, getUpperLeftY, getWidth e getHeight, que calculam a coordenada
x superior esquerda, a coordenada y superior esquerda e a largura e altura, respectivamente. 
(...) */
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_1;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    private Boolean isFilled;

    public MyOval(int x1, int y1, int x2, int y2, Color color, Boolean isFilled) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.isFilled = isFilled;
    }// constructor

    public MyOval() {
        // a) Um construtor sem argumentos que configura as coordenadas da forma como 0,
        // a cor da forma como Color.BLACK e a propriedade preenchida como false
        // (MyRectangle e MyOval somente).

        this.x1 = 0;
        this.y1 = 0;
        this.color = Color.BLACK;
        this.isFilled = false;

    }// constructor no arguments

    public void draw(Graphics g) {

        g.setColor(color);

        // c) Os métodos get para as variáveis de instância em cada classe.
        // O método draw deve referenciar as coordenadas pelos métodos get
        // em vez de acessá-los diretamente.

        if (isFilled) {
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } // if
        else {
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } // else

    }// draw

    public int getUpperLeftX() {
        // A coordenada x superior esquerda é a menor dos dois valores da coordenada x,
        if (x1 < x2) {
            return x1;
        } // if
        else {
            return x2;
        } // else

    }// getUpperLeftX

    public int getUpperLeftY() {
        // a coordenada y superior esquerda é a menor dos valores dois da coordenada y,
        if (y1 < y2) {
            return y1;
        } // if
        else {
            return y2;
        } // else

    }// getUpperLeftY

    public int getWidth() {
        // A largura é o valor absoluto da diferença entre os dois valores das
        // coordenadas x
        return Math.abs(x1 - x2);
    }// getWidth

    public int getHeight() {
        // A altura é o valor absoluto da diferença entre os dois valores das
        // coordenadas y
        return Math.abs(y1 - y2);
    }// getHeight

    /*
     * b) Métodos set para as variáveis de instância em cada classe. Os métodos que
     * configuram um valor de coordenada devem verificar se
     * o argumento é maior ou igual a zero antes de configurar a coordenada — se não
     * for, devem configurar a coordenada como zero.
     * O construtor deve chamar os métodos set em vez de inicializar as variáveis
     * locais diretamente.
     */
    public void setUpperLeftX(int x) {
        if (x < 0) {
            this.x1 = 0;
        } // if
        else {
            this.x1 = x;
        } // else
    }// setUpperLeftX

    public void setUpperLeftY(int y) {
        if (y < 0) {
            this.y1 = 0;
        } // if
        else {
            this.y1 = y;
        } // else
    }// setUpperLeftY

}// MyOval
