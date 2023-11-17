/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 262
// Figura 8.9: EmployeeTest.java
// Demonstração de composição.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_7_Date_java;

public class EmployeeTest {

    public static void main(String[] args) {

        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);

    }// main

}// EmployeeTest
