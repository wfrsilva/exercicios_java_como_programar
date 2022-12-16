
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
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

import java.util.Calendar;

public class HealthProfile {
    //Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
    //e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa
    String FirstName;
    String lastName;
    String gender;
    int yearBirth;
    int monthBirth;
    int dayBirth;
    double height;
    double weight;

    public HealthProfile(String name, String lastName, String gender, int yearBirth, int monthBirth, int dayBirth, double height, double weight){
        this.FirstName  = name;
        this.lastName = lastName;
        this.gender = gender;
        
        if(yearBirth > 0){
            this.yearBirth = yearBirth;
        }//if

        if(monthBirth > 0 && monthBirth < 13){
            this.monthBirth = monthBirth;
        }//if

        if(dayBirth > 0 && dayBirth < 32){
            this.dayBirth = dayBirth;
        }//if

        if(height > 0.0){
            this.height = height;
        }//if

        if(weight > 0.0){
            this.weight = weight;
        }//if

    }//constructor HealthProfile

    public String getName(){
        return FirstName;
    }//getName

    public void setName(String name){
        this.FirstName = name;
    }//setName

    public String getLastName(){
        return lastName;
    }//getLastName

    public void setLastName(String lastName){
        this.lastName = lastName;
    }//setLastName

    public int getYearBirth(){
        return yearBirth;
    }//getYearBirth

    public void setYearBirth(int yearBirth){
        if(yearBirth > 0){
            this.yearBirth = yearBirth;
        }//if   
    }//setYearBirth

    public int getMonthBirth(){
        return monthBirth;
    }//getMonthBirth

    public void setMonthBirth(int monthBirth){
        if(monthBirth > 0 && monthBirth < 13){
            this.monthBirth = monthBirth;
        }//if
    }//setMonthBirth

    public int getDayBirth(){
        return dayBirth;
    }//getDayBirth

    public void setDayBirth(int dayBirth){
        if(dayBirth > 0 && dayBirth < 32){
            this.dayBirth = dayBirth;
        }//if
    }//setDayBirht

    public double getHeight(){
        return height;
    }//getHeight

    public void setHeight(double height){
        if(height > 0.0){
            this.height = height;
        }//if
    }//setHeight

    public double getWeight(){
        return weight;
    }//getWeight

    public void setWeight(double weight){
        if(weight > 0.0){
            this.weight = weight;
        }//if
    }//setWeight

    public int getAge(){
        //métodos que calculem e retornem a idade do usuário em anos,
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int age = yearNow - this.yearBirth;

        return age;

    }//getYearsOld

    public int getMaxHeartRate(){
        //intervalo de frequência cardíaca máxima
        int age = this.getAge();
        
        return 220 - age;

    }//getMaxHeartRate

    public double getLowTargetHeartRate(){
        //frequência cardíaca alvo
        int maxHrRt = this.getMaxHeartRate();
        double lowTarHrRt50 = maxHrRt * 0.5;

        return lowTarHrRt50;

    }//getLowTargetHeartRate

    public double getHighTargetHeartRate(){
        //frequência cardíaca alvo
        double highTarHrRt85 = this.getMaxHeartRate() * 0.85;

        return highTarHrRt85;

    }//getHighTargetHeartRate

    public String get5085TargetHeartRate(){
        //frequência cardíaca alvo
        String targetHeartRate = String.format("(50) %.2f - (85) %.2f", this.getLowTargetHeartRate(), this.getHighTargetHeartRate());
       
        return targetHeartRate;

    }//get5085TargetHeartRate

    public double getIMC(double weight, double height){
        double IMC = weight / height * height;
        
        return IMC;

    }//getThisIMC

    public String getIMCDescription(double IMC){
        String imcDesc = "IMC Description not found";

        if(IMC <= 18.5){
            imcDesc = "Underweight";
        }//if
        else if(IMC > 18.5 && IMC <= 24.9){
            imcDesc = "Normal";
        }//else if
        else if(IMC > 24.9 && IMC <= 29.9){
            imcDesc = "Overweight";
        }//else if
        else if(IMC > 29.9){
            imcDesc = "Obese";
        }//else if
        else{
            imcDesc = "IMC Description not found";
        }//else

        return imcDesc;

    }//getIMCDescription

    public String printIMCTable(){
        String imcTable;
        imcTable = "\nBMI VALUES \n" + 
        "Underweight: \t less than 18.5 \n" + 
        "Normal: \t between 18.5 and 24.9 \n" + 
        "Overweight: \t between 25 and 29.9 \n" +
        "Obese: \t\t 30 or greater \n"
        ;

        return imcTable;
    }

    public String printHealthProfile(){
        //imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
        //então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
        //o gráfico de valores IMC do Exercício 2.33.

        String completeHealthProf;
        double imc = this.getIMC(this.weight, this.height);
        completeHealthProf = String.format(
            "Name: %s %s \t Birth (dmy): %02d/%02d/%04d \t Age: %02d %n" + 
            "Gender: %s \t IMC: %.2f \t IMC Desc: %s %n" + 
            " Max Heart Rate: %d \t Targ Heart Rate: %s %n",
            this.FirstName, this.lastName, this.dayBirth, this.monthBirth, this.yearBirth, this.getAge(),
            this.gender ,imc, this.getIMCDescription(imc),
            this.getMaxHeartRate(), this.get5085TargetHeartRate()
            
        );

        return completeHealthProf;

    }//printHealthProfile

}//HealthProfile
