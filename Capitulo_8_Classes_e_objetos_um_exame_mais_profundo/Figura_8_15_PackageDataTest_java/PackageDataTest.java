/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 270
// Figura 8.15: PackageDataTest.java
// Membros de acesso de pacote de uma classe permanecem acessíveis a outras classes
// no mesmo pacote. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_15_PackageDataTest_java;

public class PackageDataTest {

    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        System.out.printf("After instatiation: %n %s %n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("%nAfter changing values: %n %s %n", packageData);

    }// main

}// PackageDataTest

// classe com variáveis de instância de acesso de pacote

class PackageData {

    int number; // variável de instância de acesso de pacote
    String string; // variável de instância de acesso de pacote

    public PackageData() {
        number = 0;
        string = "Hello";
    }// constructor

    // retorna a representação String do objeto PackageData
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }// toString

}// PackageData
