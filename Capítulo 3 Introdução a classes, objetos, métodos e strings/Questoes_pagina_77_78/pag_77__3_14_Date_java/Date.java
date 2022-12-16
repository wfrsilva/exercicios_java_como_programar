/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 77
Questões
(...)
(Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date. */
package Questoes_pagina_77_78.pag_77__3_14_Date_java;

public class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year){
        if(month > 0 && month < 13){
            this.month = month;
        }//if

        if(day > 0 && day < 32){
            this.day = day;
        }//if

        if(year > 0 ){
            this.year = year;
        }//if

    }// constructor Date()

    public int getMonth(){
        return month;
    }//getMonth

    public void setMonth(int month){
        if(month > 0 && month < 13){
            this.month = month;
        }//if
    }//setMonth

    public int getDay(){
        return day;
    }//getDay

    public void setDay(int day){
        if(day > 0 && day < 32){
            this.day = day;
        }//if
    }//setDay

    public int getYear(){
        return year;
    }//getYear

    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }//if
    }//setYear

    public String displayDate(){
        String strDate;
        strDate = String.format("%02d/%02d/%04d",this.month, this.day, this.year);
        return strDate;
    }//displayDate
    
}//Date
