/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 65
// Figura 3.6: AccountTest.Java
// Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado. */

package Figura_3_5_Account_java;

public class AccountTest {
    public static void main (String [] args){
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }//main

}//AccountTest
