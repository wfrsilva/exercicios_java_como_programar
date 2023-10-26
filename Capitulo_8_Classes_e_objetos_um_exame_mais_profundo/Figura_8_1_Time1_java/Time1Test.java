/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 250
// Figura 8.2: Time1Test.java
// objeto Time1 utilizado em um aplicativo. */
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_1_Time1_java;

public class Time1Test {

    public static void main(String[] args) {

        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // tenta definir data/hora com valores inválidos
        try {
            time.setTime(99, 99, 99); // todos os valores fora do intervalo
        } // try
        catch (IllegalArgumentException e) {
            System.out.printf("Exception %s %n%n", e.getMessage());
        } // catch

        // exibe a data/hora após uma tentativa de definir valores inválidos
        displayTime("After calling setTime with invalid values", time);

    }// main

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s %nUniversal time: %s %nStandard time: %s %n",
                header, t.toUniversalString(), t.toString());
    }// displayTime

}// Time1Test
