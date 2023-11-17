/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 261
// Figura 8.8: Employee.java
// Classe Employee com referência a outros objetos.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_7_Date_java;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        // construtor para inicializar nome, data de nascimento e data de contratação
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }// constructor

    public String toString() {
        // converte Employee em formato de String
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);

    }// toString

}// Employee
