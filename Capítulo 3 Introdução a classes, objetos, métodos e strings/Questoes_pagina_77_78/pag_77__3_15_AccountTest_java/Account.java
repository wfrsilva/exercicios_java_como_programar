/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 67
// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação. */

package Questoes_pagina_77_78.pag_77__3_15_AccountTest_java;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }//if
    }//Account()

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }//if
    }//deposit

    public double getBalance(){
        return balance;
    }//getBalance

    public void setName(String name){
        this.name = name;
    }//setName

    public String getName(){
        return name;
    }//getName
    
}//Account
