/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 78
3.16 (Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver
se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Association
(AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular a frequência cardíaca
máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com
base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar
ou modificar um programa de exercícios físicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um
construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método
que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade
da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo. */

package Questoes_pagina_77_78.pag_78__3_16_HeartRates_java;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main (String [] args){

        HeartRates hr1 = new HeartRates("William", "Wallace", 1978, 10, 23);
        HeartRates hr2 = new HeartRates("Alice", "Eve", 1982, 2, 6);

        
        Scanner input = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String name = input.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Day of Birth: ");
        int dayBt = input.nextInt();

        System.out.print("Month of Birth: ");
        int monthBt = input.nextInt();
        
        System.out.print("Year of Birth: ");
        int yearBt = input.nextInt();

        HeartRates hr3 = new HeartRates(name, lastName, yearBt, monthBt, dayBt);
        
        System.out.println(hr1.getCompleteHeartRate());
        System.out.println(hr2.getCompleteHeartRate());
        System.out.println(hr3.getCompleteHeartRate());

        input.close();

    }//main
    
}//HeartRatesTest
