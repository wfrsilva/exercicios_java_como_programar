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

public class Employee {

    String name;
    String lastName;
    double salary;

    public Employee(String name, String lastName, double salary){
        this.name = name;
        this.lastName = lastName;
        if(salary > 0.0){
            this.salary = salary;
        }//if
    }// constructor Employee()

    public String getName(){
        return name;
    }//getName

    public void setName(String name){
        this.name = name;
    }//setName

    public String getLastName(){
        return lastName;
    }//getLastName

    public void setLastName(String lastName){
        this.lastName = lastName;
    }//setLastName

    public double getSalary(){
        return salary;
    }//getSalary

    public void setSalary(double salary){
        if(salary > 0.0){
            this.salary = salary;
        }//if
    }//setSalary

    public double getAnnualSalary(){
        return salary * 12;
    }//getAnnualSalary

}//Employee
