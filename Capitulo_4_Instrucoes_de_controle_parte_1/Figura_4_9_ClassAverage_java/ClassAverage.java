/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 96
// Figura 4.10: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por sentinela.*/
package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_9_ClassAverage_java;

import java.util.Scanner;

public class ClassAverage {

    public static void main( String [] args){

        Scanner input = new Scanner (System.in);
        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1){

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 o quit: ");
            grade = input.nextInt();

        }//while

        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }//if
        else{
            System.out.println("No grades were entered");
        }//else

        input.close();
    }//main
    
}//ClassAverage
