/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 120
// Figura 5.1: WhileCounter.java
// Repetição controlada por contador com a instrução de repetição while. */
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_1_WhileCounter_java;

public class WhileCounter {

    public static void main( String [] args){
        int counter = 1;

        while(counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }//while

        System.out.println();

    }//main
    
}//WhileCounter
