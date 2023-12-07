/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 274
// Figura 8.19: TestDraw.java
// Criando um JFrame para exibir um DrawPanel. */
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_17_MyLine_java;

import javax.swing.JFrame;

public class TestDraw {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);

    }// main

}// TestDraw
