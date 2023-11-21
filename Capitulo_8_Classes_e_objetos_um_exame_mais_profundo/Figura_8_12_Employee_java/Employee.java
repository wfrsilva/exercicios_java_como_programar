/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 266
// Figura 8.12: Employee.java
// Variável static utilizada para manter uma contagem do número de
// objetos Employee na memória.*/
//package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_12_Employee_java;

public class Employee {

    private static int count = 0; // número de empregados criados
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // incrementa contagem estática de empregados
        System.out.printf("Employee constructor: %s %s; count= %d %n", firstName, lastName, count);

    }// constructor

    public String getFirstName() {
        return firstName;
    }// getFirstName

    public String getLastName() {
        return lastName;
    }// getLastName

    public static int getCount() {
        return count;
    }// getCount

}// Employee
