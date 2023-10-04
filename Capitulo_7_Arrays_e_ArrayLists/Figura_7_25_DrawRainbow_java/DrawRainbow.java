/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 227
// Figura 7.25: DrawRainbow.java
// Desenhando um arco-íris com arcos e um array de cores.*/
package Figura_7_25_DrawRainbow_java;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {

    // cores de um arco-íris são vermelho, laranja, amarelo, azul, verde, índigo e
    // violeta. O Java tem constantes predefinidas apenas para as cinco primeiras
    // cores. // define as cores índigo e violeta
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    public DrawRainbow() {
        setBackground(Color.WHITE);
    }// constructor

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20;

        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter - 1]);
            g.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, 0, 180);
        } // for

    }// paintComponent

}// DrawRainbow
