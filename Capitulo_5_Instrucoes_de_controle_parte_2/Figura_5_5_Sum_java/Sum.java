/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 125
// Figura 5.5: Sum.java
// Somando inteiros com a instrução for. */
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_5_Sum_java;

public class Sum {
    public static void main (String [] args){
        int total = 0;

        for(int number = 2; number <= 20; number += 2){
            total += number;
        }//for

        System.out.printf("Sum is %d%n", total);

    }//main

}//Sum
