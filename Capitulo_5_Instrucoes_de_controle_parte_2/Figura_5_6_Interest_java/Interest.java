/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 126
// Figura 5.6: Interest.java
// Cálculos de juros compostos com for.*/
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_6_Interest_java;

public class Interest{

    public static void main(String [] args){

        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for( int year = 1; year <= 10; ++year){

            amount = principal * Math.pow(1.0  + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);

        }//for

    }//main

}//Interest