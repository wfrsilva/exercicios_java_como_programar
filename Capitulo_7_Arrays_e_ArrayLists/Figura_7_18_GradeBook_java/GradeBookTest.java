/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 219
// Figura 7.19: GradeBookTest.java
// GradeBookTest cria o objeto GradeBook utilizando um array bidimensional
// das notas e, então, invoca o método processGrades para analisá-las.*/
package Figura_7_18_GradeBook_java;

public class GradeBookTest {

    public static void main(String[] args) {

        int[][] gradesArray = {
                { 87, 96, 70 },
                { 68, 87, 90 },
                { 94, 100, 90 },
                { 100, 81, 82 },
                { 83, 65, 85 },
                { 78, 87, 65 },
                { 85, 75, 83 },
                { 91, 94, 100 },
                { 76, 72, 84 },
                { 87, 93, 73 } };

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programing", gradesArray);
        System.out.printf("Welcome to the grade book for %n%s %n%n", myGradeBook.getCourseName());

        myGradeBook.processGrades();

    }// main

}// GradeBookTest
