package Exercicio_5_14_Interest_java;
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
//pagina 154  
5.14 (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 (pag 126) para repetir os passos para taxas
de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.

5.14 (Modified compound interest program) Modify the compound interest application of Figure 5.6 (page 126) to repeat the steps for rates
interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.*/

public class Interest {

    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate;

        for (int r = 5; r <= 10; r++) {

            rate = (double) r / 100.0;

            System.out.printf("%n%s%20s%10s %n", "Year", "Amount on deposit", "Rate");

            for (int year = 1; year <= 5; ++year) {

                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%,10.2f%n", year, amount, rate);

            } // for

        } // for

    }// main

}// Interest
