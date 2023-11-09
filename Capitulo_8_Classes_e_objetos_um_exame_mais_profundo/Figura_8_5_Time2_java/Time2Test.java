/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 258
// Figura 8.6: Time2Test.java
// Construtores sobrecarregados utilizados para inicializar objetos Time2.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_5_Time2_java;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5:Time2 object t4 especified", t5);

        try {
            // tenta inicializar t6 com valores inválidos
            Time2 t6 = new Time2(27, 49, 99); // valores invalidos
        } // try
        catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        } // catch

    }// main

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }// displayTime

}// Time2Test
