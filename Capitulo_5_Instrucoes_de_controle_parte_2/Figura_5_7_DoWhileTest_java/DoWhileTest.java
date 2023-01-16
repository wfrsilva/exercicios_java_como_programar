/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 128
// Figura 5.7: DoWhileTest.java
// instrução de repetição do...while.*/
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_7_DoWhileTest_java;

public class DoWhileTest{

    public static void main (String [] args){

        int counter =1;

        do{
            System.out.printf("%d ", counter);
            ++counter;

        } while(counter <= 10);

        System.out.println();

    }//main

}//DoWhileTest