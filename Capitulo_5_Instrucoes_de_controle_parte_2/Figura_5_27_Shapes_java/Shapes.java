// Figura 5.27: Shapes.java
// Desenhando uma cascata de formas com base na escolha do usuário.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_27_Shapes_java;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {

    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }// Shapes

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(
                            10 + i * 10,
                            10 + i * 10,
                            50 + i * 10,
                            50 + i * 10);
                    break;
                case 2:
                    g.drawOval(
                            10 + i * 10,
                            10 + i * 10,
                            50 + i * 10,
                            50 + i * 10);
                    break;
            }// switch
        } // for
    }// paintComponent

}// Shapes
