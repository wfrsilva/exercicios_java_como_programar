/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
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

public class Invoice {
    String number;
    String description;
    int quantity;
    double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } // if
        if (price > 0) {
            this.price = price;
        } // if

    }// constructor Invoice()


    public double getIncoiveAmount(){
        double amount;
        amount  = quantity * price;
        return amount;
    }//getIncoiveAmount

    //// GETTERS SETTERS
    public String getNumber() {
        return number;
    }// getNumber

    public void setNumber(String number) {
        this.number = number;
    }// setNumber

    public String getDescription() {
        return description;
    }// getDescription

    public void setDescription(String description){
        this.description = description;
    }//setDescription

    public int getQuantity(){
        return quantity;
    }//getQuantity

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } // if
    }// setQuantity

    public double getPrice(){
        return price;
    }//getPrice

    public void setPrice(double price){
        if(price > 0.0){
            this.price = price;
        }//if
    }//setPrice

}//Invoice
