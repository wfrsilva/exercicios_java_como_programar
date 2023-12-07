/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 274
// Figura 8.18: DrawPanel.java
// Programa que utiliza a classe MyLine
// para desenhar linhas aleatórias. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_17_MyLine_java;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;

    public DrawPanel() {

        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        for (int count = 0; count < lines.length; count++) {

            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1, y1, x2, y2, color);

        } // for

    }// constructor

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (MyLine line : lines) {
            line.draw(g);
        } // for

    }// paintComponent

}// DrawPanel
