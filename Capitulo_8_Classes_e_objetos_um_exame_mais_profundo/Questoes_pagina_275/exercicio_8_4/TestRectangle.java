/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 279 
exemplo na pagina 147
8.4 (Classe Rectangle) Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça
os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura
(width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que
20,0. Escreva um programa para testar a classe Rectangle. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_4;


public class TestRectangle {
    
    public static void main(String [] args){
        Rectangle rect1 = new Rectangle(0.0,0.0);
        Rectangle rect2 = new Rectangle(4.0,5.0);

        rect1.toStrArea();
        rect1.toStrPerimeter();

        rect2.toStrArea();
        rect2.toStrPerimeter();

        rect1.setLength(3.0);
        rect1.setWidth(6.0);

        rect1.toStrArea();
        rect1.toStrPerimeter();

    }//main

}//TestRectangle
