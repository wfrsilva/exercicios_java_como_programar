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

import java.util.Calendar;

public class HeartRates {
    String name;
    String lastName;
    int yearBirth;
    int monthBirth;
    int dayBirth;

    public HeartRates(String name, String lastName, int yearBirth, int monthBirth, int dayBirth){
        this.name = name;
        this.lastName = lastName;

        if(yearBirth > 0){
            this.yearBirth = yearBirth;
        }//if

        if(monthBirth > 0 && monthBirth < 13){
            this.monthBirth = monthBirth;
        }//if

        if(dayBirth > 0 && dayBirth < 32){
            this.dayBirth = dayBirth;
        }//if

    }//constructor HeartRates

    public String getName(){
        return name;
    }//getName
    
    public void setName(String name){
        this.name = name;
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

    public int getYearsOld(){
        //A classe também deve incluir um método que calcule e retorne a idade (em anos)
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int age = yearNow - this.yearBirth;
        return age;
    }//getYearsOld

    public int getMaxHeartRate(){
        //um que calcule e retorne a frequência cardíaca máxima
        //frequência cardíaca máxima por minuto é 220 menos a idade em anos.
        int age = this.getYearsOld();
        return 220 - age;
    }//getMaxHeartRate
    
    //e um que calcule e retorne a frequência cardíaca alvo da pessoa.
    //Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.
    public String getTargetHeartRate(){
        int maxHrRt = this.getMaxHeartRate();
        double tarHrRt50 = maxHrRt * 0.5;
        double tarHrRt85 = maxHrRt * 0.85;
        String targetHeartRate = String.format("(50) %.2f - (85) %.2f", tarHrRt50, tarHrRt85);
        return targetHeartRate;

    }//getTargetHeartRate

    public String getCompleteHeartRate(){
        String completeHr;
        int maxHrRt = this.getMaxHeartRate();
        String targetHeartRate = this.getTargetHeartRate();
       
        completeHr = String.format(
            "%nName: %s %s \t Birth(d-m-y): %d/%d/%d \t Age: %d %n Max Heart Rate: %d \t Targ Heart Rate: %s", 
            this.name, this.lastName, this.dayBirth, this.monthBirth, this.yearBirth, this.getYearsOld(), maxHrRt,targetHeartRate);

            return completeHr;
        
    }//getCompleteHeartRate

}//HeartRates
