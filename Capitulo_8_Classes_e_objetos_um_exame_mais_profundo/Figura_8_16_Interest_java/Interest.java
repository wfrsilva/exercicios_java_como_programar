/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 270
// Figura 8.16: Interest.java
// Cálculos de juros compostos com BigDecimal. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_16_Interest_java;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

    public static void main(String[] args) {

        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%4d%20s %n", year, NumberFormat.getCurrencyInstance().format(amount));
        } // for

    }// main

}// Interest
