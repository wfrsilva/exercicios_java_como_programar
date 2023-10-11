/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 227
// Figura 7.25: DrawRainbow.java
// Desenhando um arco-íris com arcos e um array de cores.*/
package Figura_7_25_DrawRainbow_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawRainbow extends JPanel {
    private int x, y; // Coordenadas iniciais
    private int length = 10; // Comprimento inicial
    private int direction = 0; // 0 = direita, 1 = baixo, 2 = esquerda, 3 = cima

    public DrawRainbow() {
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawSpiral();
            }
        });
        timer.start();
    }

    private void drawSpiral() {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);

        // Calcula o próximo ponto com base na direção atual
        int nextX = x;
        int nextY = y;

        switch (direction) {
            case 0: // Para a direita
                nextX += length;
                break;
            case 1: // Para baixo
                nextY += length;
                break;
            case 2: // Para a esquerda
                nextX -= length;
                break;
            case 3: // Para cima
                nextY -= length;
                break;
        }

        // Desenha a linha
        g.drawLine(x, y, nextX, nextY);

        // Atualiza as coordenadas
        x = nextX;
        y = nextY;

        // Aumenta o comprimento a cada duas linhas
        if (direction % 2 == 0) {
            length += 10;
        }

        // Muda a direção
        direction = (direction + 1) % 4;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiral Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SpiralDrawing());
        frame.setVisible(true);
    }
}
