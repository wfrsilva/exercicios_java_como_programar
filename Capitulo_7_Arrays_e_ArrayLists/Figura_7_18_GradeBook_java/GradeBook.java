
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 216
// Figura 7.18: GradeBook.java
// classe GradeBook utilizando um array bidimensional para armazenar notas.*/
package Figura_7_18_GradeBook_java;

public class GradeBook {

    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {

        this.courseName = courseName;
        this.grades = grades;
    }// cosntructor gradebook

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }// setCourseName

    public String getCourseName() {
        return courseName;
    }// getCourseName

    public void processGrades() {

        outputGrades();

        System.out.printf("%n%s %d %n%s %d %n%n", "Lowest grade in the grade book is", getMinimum(),
                "Highes grade in the grade book is", getMaximum());

        outputBarChart();

    }// processGrades

    public int getMinimum() {
        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                } // if
            } // for
        } // for

        return lowGrade;

    }// getMinimum

    public int getMaximum() {
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                } // if
            } // for
        } // for

        return highGrade;

    }// getMaximum

    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        } // for

        return (double) total / setOfGrades.length;

    }// getAverage

    public void outputBarChart() {

        System.out.println("Overall grade distribution:");

        int[] frequency = new int[11];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            } // for
        } // for

        for (int count = 0; count < frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } // if
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            } // else

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            } // for

            System.out.println();

        } // for

    }// outputBarChart

    public void outputGrades() {

        System.out.printf("The grades are: %n%n");
        System.out.print("            "); // alinha titulos de coluna

        // titulo de coluna para cada teste
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        } // for

        System.out.println("Average"); // titulo coluna media do aluno

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            } // for

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f %n", average);

        } // for

    }// outputGrades

}// GradeBook
