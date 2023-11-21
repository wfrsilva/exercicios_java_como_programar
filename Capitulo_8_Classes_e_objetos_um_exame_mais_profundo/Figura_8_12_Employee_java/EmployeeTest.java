/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 267
// Figura 8.13: EmployeeTest.java
// Demonstração do membro static. */
//package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_12_Employee_java;

public class EmployeeTest {

    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d %n", Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        System.out.printf("%nEmployess after instantiation: %n");
        System.out.printf("via e1.getCount(): %d %n", e1.getCount());
        System.out.printf("via e2.getCount(): %d %n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d %n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s %nEmployee 2: %s %s %n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }// main

}// EmployeeTest
