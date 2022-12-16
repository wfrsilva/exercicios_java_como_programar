/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 77
Questões
(...)
3.12 (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.
Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice. */

package Questoes_pagina_77_78.pag_77__3_12_Invoice_java;

public class InvoiceTest {
    public static void main(String [] args){
        Invoice item1 = new Invoice("0001","Blue Pen", 100, 11.55);
        Invoice item2 = new Invoice("0002","Black Pencil", 15 , 2.25);
        Invoice item3 = new Invoice("0003", "White Ruber", 5, 3.45);

        System.out.println("==========\t\tINVOICE\t\t==========");
        System.out.println("Number \t Description \t quantity \t price \t subtotal");
        System.out.printf("%s \t %s \t %d \t\t %5.2f \t %10.2f %n", item1.getNumber(), item1.getDescription(), item1.getQuantity(), item1.getPrice(), item1.getIncoiveAmount());
        System.out.printf("%s \t %s \t %d \t\t %5.2f \t %10.2f %n", item2.getNumber(), item2.getDescription(), item2.getQuantity(), item2.getPrice(), item2.getIncoiveAmount());
        System.out.printf("%s \t %s \t %d \t\t %5.2f \t %10.2f %n", item3.getNumber(), item3.getDescription(), item3.getQuantity(), item3.getPrice(), item3.getIncoiveAmount());
        System.out.println("----------\t\t\t\t----------");
        double totalInvoice = item1.getIncoiveAmount() + item2.getIncoiveAmount() + item3.getIncoiveAmount();
        System.out.printf("Total %53.2f", totalInvoice);

    }//main

}//InvoiceTest
