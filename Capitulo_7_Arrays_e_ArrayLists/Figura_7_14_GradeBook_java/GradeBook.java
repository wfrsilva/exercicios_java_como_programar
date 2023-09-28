/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 210
// Figura 7.14: GradeBook.java
// classe GradeBook utilizando um array para armazenar notas de teste.*/
package Figura_7_14_GradeBook_java;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }// constructor GradeBook

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }// setCourseName

    public String getCourseName() {
        return courseName;
    }// getCourseName

    public void processGrades() {

        outputGrades();

        System.out.printf("%n Class average is %.2f %n", getAverage());

        System.out.printf(" Lowest grade is %d %n Highest grade is %d %n%n", getMinimum(), getMaximum());

        outputBarChart();

    }// processGrades

    public int getMinimum() {
        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade) {
                lowGrade = grade;
            } // if
        } // for

        return lowGrade;

    }// getMinimum

    public int getMaximum() {
        int highGrade = grades[0];

        for (int grade : grades) {
            if (grade > highGrade) {
                highGrade = grade;
            } // if
        } // for

        return highGrade;

    }// getMaximum

    public double getAverage() {
        int total = 0;

        for (int grade : grades) {
            total += grade;
        } // for

        return (double) total / grades.length;

    }// getAverage

    public void outputBarChart() {
        System.out.println("Grade dsitribution:");

        int[] frequency = new int[11];

        for (int grade : grades) {
            ++frequency[grade / 10];
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

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d %n", student + 1, grades[student]);
        } // for

    }// outputGrades

}// GradeBook
