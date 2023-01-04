/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 106
// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel. */

package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_18_DrawPanel_java;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);

        g.drawLine(0, height, width, 0);
    }//paintComponent
    
}//DrawPanel
