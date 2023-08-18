package Exercicio_5_14_Interest_java;
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
//pagina 154  
5.14 (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 (pag 126) para repetir os passos para taxas
de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.

5.14 (Modified compound interest program) Modify the compound interest application of Figure 5.6 (page 126) to repeat the steps for rates
interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.*/

public class JurosCompostos {

    public static void main(String[] args) {
        double quantia;
        double principal = 1000.0;
        double taxa;

        for (int t = 5; t <= 10; t++) {

            taxa = (double) t / 100.0;

            System.out.printf("%n%s%20s%10s %n", "Ano", "Quantia deposito", "Taxa");

            for (int ano = 1; ano <= 5; ++ano) {

                quantia = principal * Math.pow(1.0 + taxa, ano);
                System.out.printf("%4d%,20.2f%,10.2f%n", ano, quantia, taxa);

            } // for

        } // for

    }// main

}// JurosCompostos
