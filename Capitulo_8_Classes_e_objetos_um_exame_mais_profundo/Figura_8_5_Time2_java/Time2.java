/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 254
// Figura 8.5: Time2.java
// declaração da classe Time2 com construtores sobrecarregados.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_5_Time2_java;

public class Time2 {
    private int hour; // 00-23
    private int minute; // 00-59
    private int second; // 00-59

    public Time2() {
        // construtor sem argumento Time2:
        // inicializa cada variável de instância para zero
        this(0, 0, 0);
    }// construtor

    public Time2(int hour) {
        // Construtor Time2: hora fornecida, minuto e segundo padronizados para 0
        this(hour, 0, 0);
    }// construtor

    public Time2(int hour, int minute) {
        // Construtor Time2: hora e minuto fornecidos, segundo padronizado para 0
        this(hour, minute, 0);
    }// construtor

    public Time2(int hour, int minute, int second) {
        // Construtor Time2: hour, minute e second fornecidos
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 00-23");
        } // if

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 00-59");
        } // if

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 00-59");
        } // if

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }// construtor

    public Time2(Time2 time) {
        // Construtor Time2: outro objeto Time2 fornecido
        // invoca o construtor com três argumentos
        this(time.getHour(), time.getMinute(), time.getSecond());
    }// construtor

    // Métodos set
    public void setTime(int hour, int minute, int second) {
        // Configura um novo valor de tempo usando hora universal;
        // valida os dados
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 00-23");
        } // if

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 00-59");
        } // if

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 00-59");
        } // if

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }// setTime

    public void setHour(int hour) {
        // valida e configura a hora
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 00-23");
        } // if
        this.hour = hour;
    }// setHour

    public void setMinute(int minute) {
        // valida e configura os minutos
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 00-59");
        } // if
        this.minute = minute;
    }// setMinute

    public void setSecond(int second) {
        // valida e configura os segundos
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 00-59");
        } // if
        this.second = second;
    }// setSecond

    // Métodos get
    public int getHour() {
        // obtém valor da hora
        return hour;
    }// getHour

    public int getMinute() {
        // obtém valor dos minutos
        return minute;
    }// getMinute

    public int getSecond() {
        // obtém valor dos segundos
        return second;
    }// getSecond

    public String toUniversalString() {
        // converte em String no formato de data/hora universal (HH:MM:SS)
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }// toUniversalString

    public String toString() {
        // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }// toString

}// Time2
