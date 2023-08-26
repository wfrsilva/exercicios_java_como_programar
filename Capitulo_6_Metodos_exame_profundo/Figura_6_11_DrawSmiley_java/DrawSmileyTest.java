/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 179

// Figura 6.12: DrawSmileyTest.java
// Test application that displays a smiley face. */
package Figura_6_11_DrawSmiley_java;

import javax.swing.JFrame;

public class DrawSmileyTest {

    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }// main

}// DrawSmileyTest
