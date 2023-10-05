//chatgpt nao consegui fazer

package Questoes_pagina_229;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpiralDrawing extends JPanel {
    private int x, y; // Coordenadas iniciais (no centro do painel)
    private int length = 10; // Comprimento inicial
    private int direction = 0; // 0 = direita, 1 = baixo, 2 = esquerda, 3 = cima

    public SpiralDrawing() {
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Define as coordenadas iniciais no centro do painel
        x = getWidth() / 2;
        y = getHeight() / 2;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiral Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SpiralDrawing());
        frame.setVisible(true);
    }
}
