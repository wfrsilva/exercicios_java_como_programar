/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 59
// Figura 3.2: AccountTest.Java
// Cria e manipula um objeto Account. */

import java.util.Scanner;

public class AccountTest {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());

    }//main
    
}//AccountTest
