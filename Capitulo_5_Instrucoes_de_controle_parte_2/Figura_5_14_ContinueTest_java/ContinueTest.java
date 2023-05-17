// Figura 5.14: ContinueTest.java
// Instrução continue que termina uma iteração de uma instrução for.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_14_ContinueTest_java;

public class ContinueTest{
    public static void main (String [] args){
        for (int count = 1; count <=10; count++){
            if(count == 5){
                continue;
            }//if

            System.out.printf("%d ", count);

        } //for

        System.out.printf("%nUsed continue to skip printing 5%n");

    }//main

}//ContinueTest