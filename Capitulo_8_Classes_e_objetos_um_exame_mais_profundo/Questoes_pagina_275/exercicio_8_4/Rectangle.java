/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 279 
exemplo na pagina 147
8.4 (Classe Rectangle) Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça
os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura
(width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que
20,0. Escreva um programa para testar a classe Rectangle. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Questoes_pagina_275.exercicio_8_4;


public class Rectangle {

    private double length = 1.0;
    private double width = 1.0;

    
    public Rectangle(double length, double width){
        if(length > 0.0 && length < 20.0){
            this.length = length;
        }//if
        else{
            this.length = 1.0;
        }


        if(width > 0.0 && width < 20.0){
            this.width = width;
        }//if
        else{
            this.width = 1.0;
        }//else

    }//constructor


    public double calculateArea(){
        return getLength() * getWidth();
    }//calculateArea

    public String toStrArea(){
        return String.format("Area rectangle (%.2f, %.2f): %.2f", getLength(), getWidth(), calculateArea());
    }//toStrArea

    public double calculatePerimeter(){
        return 2 * getLength() + 2 * getWidth();
    }//calculatePerimeter

    public String toStrPerimeter(){
        return String.format("Perimeter rectangle (%.2f, %.2f): %.2f", getLength(), getWidth(), calculatePerimeter());
    }//toStrPerimeter

    public double getLength(){
        return length;
    }//getLength



    public double getWidth(){
        return width;
    }//getWidth

    

    public void setLength(double length){
        if(length > 0.0 && length < 20.0){
            this.length = length;
        }//if
        else{
            this.length = 1.0;
        }
    }//setLength

    public void setWidth(double width){
        if(width > 0.0 && width < 20.0){
            this.width = width;
        }//if
        else{
            this.width = 1.0;
        }//else
    }//setWidth
    
}//Rectangle
