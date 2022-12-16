/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 78
3.17 (Computadorização dos registros de saúde) Uma questão relacionada à assistência médica discutida ultimamente nos veículos de
comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações
quanto à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre
vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos,
reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33. */

package Questoes_pagina_77_78.pag_78__3_17_HealthProfile_java;

import java.util.Scanner;

public class HealthProfileTest {
    
    public static void main (String [] args){

        HealthProfile hp1 = new HealthProfile("Wendy", "Jungle", "Female", 1968, 10, 23, 1.65, 95);
        HealthProfile hp2 = new HealthProfile("Alinice", "Forest", "Female", 2018, 4, 5, 1.1, 15.5);

        Scanner input = new Scanner(System.in);

        System.out.print("Fisrt Name: ");
        String fName = input.nextLine();

        System.out.print("Last Name: ");
        String lName = input.nextLine();

        System.out.print("Gender (m/f): ");
        String gndInput = input.nextLine();
        String gender;
        if(gndInput.toUpperCase().equals("M")){
            gender = "Male";
        }//if
        else if(gndInput.toUpperCase().equals("F")){
            gender = "Female";
        }//else if
        else{
            gender = gndInput;
        }//else

        System.out.print("Day of birth: ");
        int dayBt = input.nextInt();

        System.out.print("Month of birth: ");
        int monthBt = input.nextInt();

        System.out.print("Year of Birth: ");
        int yearBt = input.nextInt();

        System.out.print("Height (mt): ");
        double height = input.nextDouble(); 

        System.out.print("Weight (kg): ");
        double weight = input.nextDouble();

        HealthProfile hp3 = new HealthProfile(fName, lName, gender, yearBt, monthBt, dayBt, height, weight);

        System.out.println(hp1.printHealthProfile());
        System.out.println(hp2.printHealthProfile());
        System.out.println(hp3.printHealthProfile());
        System.out.println(hp1.printIMCTable());

        input.close();

    }//main

}//HealthProfileTest
