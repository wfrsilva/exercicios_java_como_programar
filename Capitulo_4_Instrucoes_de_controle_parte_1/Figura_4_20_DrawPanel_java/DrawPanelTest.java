/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 107
// Exercícios do estudo de caso sobre GUIs e imagens gráficas
// Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo, estendendo-as até
que cubram a metade superior esquerda do painel. Uma abordagem é dividir a largura e altura em um número igual de passos (descobrimos
que 15 passos funcionam bem). A primeira extremidade de uma linha sempre estará no canto superior esquerdo (0, 0).
A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cima em um passo vertical e para
a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. Continue movendo-se para cima e para o passo à
direita a fim de encontrar cada extremidade sucessiva. A figura deve ser dimensionada de maneira correspondente à medida que você
redimensiona a janela. */

import javax.swing.JFrame;

public class DrawPanelTest{

    public static void main( String [] args){
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }//main

}//DrawPaneltest