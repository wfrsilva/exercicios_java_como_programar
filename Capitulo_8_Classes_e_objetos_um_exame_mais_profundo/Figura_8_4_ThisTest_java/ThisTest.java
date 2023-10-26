/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 253
// Figura 8.4: ThisTest.java
// this utilizado implícita e explicitamente para referência a membros de um objeto.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_4_ThisTest_java;

public class ThisTest {

    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }// main

}// class ThisTest

// classe SimpleTime demonstra a referência "this"
class SimpleTime {

    private int hour; // 00-23
    private int minute; // 00-59
    private int second; // 00-59

    // se o construtor utilizar nomes de parâmetro idênticos a
    // nomes de variáveis de instância a referência "this" será
    // exigida para distinguir entre os nomes
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour; // configura a hora do objeto "this"
        this.minute = minute; // configura o minuto do objeto "this"
        this.second = second; // configura o segundo do objeto "this"
    }// constructor SimpleTime

    // utilizam "this" explícito e implícito para chamar toUniversalString
    public String buildString() {
        return String.format("%24s: %s %n%24s: %s",
                "this.toUniversalString() ", this.toUniversalString(),
                "toUniversalString() ", toUniversalString());
    }// buildString

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        // "this" não é requerido aqui para acessar variáveis de instância,
        // porque o método não tem variáveis locais com os mesmos
        // nomes das variáveis de instância
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }// toUniversalString

}// class SimpleTime