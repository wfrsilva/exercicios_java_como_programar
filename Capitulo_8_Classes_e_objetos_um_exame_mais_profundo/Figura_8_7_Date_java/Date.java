/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 260
// Figura 8.7: Date.java
// Declaração da classe Date.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_7_Date_java;

public class Date {

    private int month; // 01-12
    private int day; // 01-31 conforme mes
    private int year; // qualquer ano

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int month, int day, int year) {
        // construtor: confirma o valor adequado para o mês e dia dado o ano

        if (month <= 0 || month > 12) {
            // verifica se mês está no intervalo
            throw new IllegalArgumentException("month (" + month + ") must be 01-12");
        } // if

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            // verifica se day está no intervalo para month
            throw new IllegalArgumentException("day (" + day + ") out-of-range for specified month and year");
        } // if

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            // verifique no ano bissexto se o mês é 2 e o dia é 29
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        } // if

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s %n", this);

    }// construtor

    public String toString() {
        // retorna uma String no formato mês/dia/ano
        return String.format("%d/%d/%d", month, day, year);
    }// toString

}// Date
