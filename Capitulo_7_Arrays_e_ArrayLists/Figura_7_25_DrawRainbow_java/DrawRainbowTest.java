/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 229
// Figura 7.26: DrawRainbowTest.java
// Aplicativo de teste para exibir um arco-íris.*/
package Figura_7_25_DrawRainbow_java;

import javax.swing.JFrame;

public class DrawRainbowTest {

    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }// main

}// DrawRainbowTest
