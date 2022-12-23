/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 101
// Figura 4.12: Analysis.java
// Análise dos resultados do exame utilizando instruções de controle aninhadas.*/

package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_12_Analysis_java;

import java.util.Scanner;

public class Analysis {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while(studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1){
                passes = passes + 1;
            }//if
            else{
                failures = failures + 1;
            }//else

            studentCounter = studentCounter + 1;

        }//while

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if( passes > 8){
            System.out.println("Bonus toinstructor!");
        }//if

        input.close();
        
    }//main

}//Analysis
