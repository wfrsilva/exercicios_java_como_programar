/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 90
// Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por contador.*/
package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_4_Student_java;

import java.util.Scanner;

public class ClassAverage {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }//while

        int average = total / 10;

        System.out.printf("%nTotal of all grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

        input.close();

    }//main
    
}//ClassAverage
