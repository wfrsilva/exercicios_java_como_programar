/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 212
// Figura 7.15: GradeBookTest.java
// GradeBookTest cria um objeto GradeBook utilizando um array de notas,
// e, então, invoca o método processGrades para analisá-las.*/
package Figura_7_14_GradeBook_java;

public class GradeBookTest {

    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);

        System.out.printf("Welcome to the grade book for %n %s %n%n", myGradeBook.getCourseName());

        myGradeBook.processGrades();

    }// main

}// GradeBookTest
