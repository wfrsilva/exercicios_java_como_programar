/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 77
3.15 (Removendo código duplicado no método main) Na classe AccountTest da Figura 3.9 (pag 68), o método main contém seis instruções
(linhas 13 e 14, 15 e 16, 28 e 29, 30 e 31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto Account. Estude essas instruções
e você perceberá que elas só diferem no objeto Account sendo manipulado — account1 ou account2. Neste exercício, você
definirá um novo método displayAccount que contém uma cópia dessa instrução de saída. O parâmetro do método será um objeto
Account e o método irá gerar name e balance dele. Então você substituirá as seis instruções duplicadas em main por chamadas para
displayAccount passando como argumento o objeto específico Account para saída.
Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte método displayAccount após a chave direita de fechamento
de main e antes da chave direita de fechamento da classe AccountTest:
public static void displayAccount(Account accountToDisplay)
{
// coloque aqui a instrução que exibe
// o name e o balance de accountToDisplay
}
Substitua o comentário no corpo do método por uma instrução que exiba name e balance de accountToDisplay.
Lembre-se de que main é um método static, assim pode ser chamado sem antes criar um objeto da classe em que é declarado. Também
declaramos o método displayAccount como um método static. Quando main tem de chamar outro método na mesma classe
sem antes criar um objeto dela, o outro método também deve ser declarado static.
Depois de concluir a declaração de displayAccount, modifique main para substituir as instruções que exibem name e balance de
cada Account pelas chamadas para displayAccount — cada uma recebendo como seu argumento o objeto account1 ou account2,
como apropriado */

package Questoes_pagina_77_78.pag_77__3_15_AccountTest_java;

import java.util.Scanner;

public class AccountTestDisplay {

    public static void main(String[] args) {
        Account acc1 = new Account("Jane Blue", 75.00);
        Account acc2 = new Account("John Red", -7.35);

        displayAccount(acc1);
        displayAccount(acc2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        acc1.deposit(depositAmount);

        displayAccount(acc1);
        displayAccount(acc2);

        System.out.print("enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        acc2.deposit(depositAmount);

        displayAccount(acc1);
        displayAccount(acc2);

        input.close();
    }// main

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }// displayAccount

}// AccountTestDisplay
