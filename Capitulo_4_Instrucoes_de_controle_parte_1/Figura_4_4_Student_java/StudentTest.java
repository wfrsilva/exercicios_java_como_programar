/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 88
// Figura 4.5: StudentTest.java
// Cria e testa objetos Student.*/
package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_4_Student_java;

public class StudentTest {
    public static void main(String [] args){
       Student std1 = new Student("Jane Green", 93.5);
       Student std2 = new Student("John Blue", 72.75);

       System.out.printf("%s's letter grade is: %s%n", std1.getName(), std1.getLetterGrade());
       System.out.printf("%s's letter grade is: %s%n", std2.getName(), std2.getLetterGrade());

    }//main
    
}//StudentTest
