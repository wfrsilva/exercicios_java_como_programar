// Figura 5.13: BreakTest.java
// a instrução break sai de uma instrução for.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_13_BreakTest_java;

public class BreakTest{

    public static void main (String [] args){

        int count;
        for(count = 1; count <= 10; count++) {
            if (count == 5){
                break;
            }//if

            System.out.printf("%d ", count);

        }//for

        System.out.printf("%nBroke out of loop at count = %d%n", count);

    }//main

}//BreakTest
