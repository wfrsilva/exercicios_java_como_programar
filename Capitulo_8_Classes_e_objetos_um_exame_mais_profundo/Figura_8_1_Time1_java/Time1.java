/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 248
// Figura 8.1: Time1.java
// Declaração de classe Time1 mantém a data/hora no formato de 24 horas. */
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_1_Time1_java;

public class Time1 {
    private int hour; // 00 - 23
    private int minute; // 00 - 59
    private int second; // 00 - 59

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        } // if

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }// setTime

    // String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }// toUniversalString

    // String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }// toString

}// Time1
