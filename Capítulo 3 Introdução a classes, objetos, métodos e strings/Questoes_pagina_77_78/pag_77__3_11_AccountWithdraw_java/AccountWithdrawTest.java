/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 77
Questões
(...)
3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira dinheiro
de uma Account. Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado
e o método deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance" [Valor de débito
excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw. */

package Questoes_pagina_77_78.pag_77__3_11_AccountWithdraw_java;

import java.util.Scanner;

public class AccountWithdrawTest {
    
    public static void main (String [] args){

        AccountWithdraw accwit1 = new AccountWithdraw("Jane Yellow", 55.00);
        AccountWithdraw accwit2 = new AccountWithdraw("John Gray", -8.64);

        System.out.printf("%s balance: $%.2f %n", accwit1.getName(), accwit1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", accwit2.getName(), accwit2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for accwit1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to accwit1 balance%n%n", depositAmount);
        accwit1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", accwit1.getName(), accwit1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", accwit2.getName(), accwit2.getBalance());

        System.out.print("Enter deposit mount for accwit2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to accwit2 balance%n%n", depositAmount);
        accwit2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", accwit1.getName(), accwit1.getBalance());
        System.out.printf("%s balance: $%.2f %n", accwit2.getName(), accwit2.getBalance());


        ////////withdraw
        System.out.print("Enter withdraw amount for accwit1: ");
        double wdrawAmount = input.nextDouble();
        System.out.printf("%nRemoving %.2f to accwit1 balance%n%n", wdrawAmount);
        accwit1.withdraw(wdrawAmount);

        System.out.printf("%s balance: $%.2f %n", accwit1.getName(), accwit1.getBalance());
        System.out.printf("%s balance: $%.2f %n", accwit2.getName(), accwit2.getBalance());


        System.out.print("Enter withdraw amount for accwit2: ");
        wdrawAmount = input.nextDouble();
        System.out.printf("%nRemoving %.2f to accwit2 balance%n%n", wdrawAmount);
        accwit2.withdraw(wdrawAmount);

        System.out.printf("%s balance: $%.2f %n", accwit1.getName(), accwit1.getBalance());
        System.out.printf("%s balance: $%.2f %n", accwit2.getName(), accwit2.getBalance());

        input.close();

    }//main

}//AccountWithdrawTest
