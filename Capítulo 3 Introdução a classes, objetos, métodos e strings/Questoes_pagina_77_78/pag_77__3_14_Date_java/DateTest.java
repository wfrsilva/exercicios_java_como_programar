/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 77
Questões
(...)
(Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date. */

package Questoes_pagina_77_78.pag_77__3_14_Date_java;

public class DateTest {

    public static void main(String [] args){
        Date dt1 = new Date(10, 23, 1978);
        Date dt2 = new Date(04, 05, 2018);

        System.out.println(dt1.displayDate());
        System.out.println(dt2.displayDate());
        
    }//main
    
}//DateTest
