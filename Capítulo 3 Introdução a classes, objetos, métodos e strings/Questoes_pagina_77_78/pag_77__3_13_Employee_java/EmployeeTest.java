/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 77
Questões
(...)
3.13 (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee. */
package Questoes_pagina_77_78.pag_77__3_13_Employee;

public class EmployeeTest {

    public static void main(String [] args){

        Employee emp1 = new Employee("Ayrton", "Senna", 1000.00);
        Employee emp2 = new Employee("James", "Reynor", 500.00);

        System.out.printf("Employee: \t %s %s \t Salary: %10.2f \tAnnual: %10.2f %n", emp1.getName(), emp1.getLastName(), emp1.getSalary(), emp1.getAnnualSalary());
        System.out.printf("Employee: \t %s %s \t Salary: %10.2f \tAnnual: %10.2f %n", emp2.getName(), emp2.getLastName(), emp2.getSalary(), emp2.getAnnualSalary());

        System.out.println("\n========== 10% Salary increase =========");
        emp1.setSalary(emp1.getSalary() * 1.1);
        emp2.setSalary(emp2.getSalary() * 1.1);

        System.out.printf("Employee: \t %s %s \t Salary: %10.2f \tAnnual: %10.2f %n", emp1.getName(), emp1.getLastName(), emp1.getSalary(), emp1.getAnnualSalary());
        System.out.printf("Employee: \t %s %s \t Salary: %10.2f \tAnnual: %10.2f %n", emp2.getName(), emp2.getLastName(), emp2.getSalary(), emp2.getAnnualSalary());

    }//main
    
}//EmployeeTest
