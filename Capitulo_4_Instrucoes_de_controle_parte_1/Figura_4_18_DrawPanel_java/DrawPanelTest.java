/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 106
// Figura 4.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel. */
package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_18_DrawPanel_java;

import javax.swing.JFrame;

public class DrawPanelTest {

    public static void main(String [] args){

        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);

    }//main
    
}//DrawPanelTest
