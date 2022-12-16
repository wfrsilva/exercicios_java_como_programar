/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 87
// Figura 4.4: Student.java
// Classe Student que armazena o nome e a média de um aluno.*/

package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_4_Student_java ;

public class Student {

    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;

        if(average > 0.0){
            if(average <=100.0){
                this.average = average;
            }//if
        }//if

    }//contructor Student

    public void setName(String name){
        this.name = name;
    }//setName

    public String getName(){
        return name;
    }//getName

    public void setAverage(double average){
        if(average > 0.0){
            if(average <= 100.0){
                this.average = average;
            }//if
        }//if
    }//setAverage

    public double getAverage(){
        return average;
    }//getAverage

    public String getLetterGrade(){
        String letterGrade = "";

        if(average >= 90.0){
            letterGrade = "A";
        }//if
        else if(average >= 80.0){
            letterGrade = "B";
        }//else if
        else if(average >= 70.0){
            letterGrade= "C";
        }//else if
        else if(average >= 60.0){
            letterGrade = "D";
        }//else if
        else {
            letterGrade = "F";
        }//else

        return letterGrade;
    }//getLetterGrade
    
}//Student