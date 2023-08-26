/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 179
// Figura 6.11: DrawSmiley.java
// Desenhando um rosto sorridente com cores e formas preenchidas.
// Drawing a smiley face with colors and filled shapes. */
package Figura_6_11_DrawSmiley_java;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // rosto, face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // olhos, eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // boca, mouth
        g.fillOval(50, 110, 120, 60);

        // sorriso, smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }// paintComponent

}// DrawSmiley
