/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 175
// Figura 6.9: Scope.java
// A classe Scope demonstra os escopos de campo e de variável local.
// The Scope class demonstrates field and local variable scopes. */
package Figura_6_9_Scope_java;

public class Scope {

    private static int x = 1; // campo acessível para todos os métodos dessa classe

    public static void main(String[] args) {

        int x = 5; // variável local x do método sombreia o campo x

        System.out.printf("Local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable tem uma variável local x
        useField(); // useField utiliza o campo x da classe Scope
        useLocalVariable(); // useLocalVariable reinicializa a variável local x
        useField(); // campo x da classe Scope retém seu valor

        System.out.printf("%nLocal x in main is %d%n", x);

    }// main

    public static void useLocalVariable() {

        int x = 25; // inicializada toda vez que useLocalVariable é chamado

        System.out.printf("%nLocal x on entering method useLocalVariable is %d%n", x);
        ++x;// modifica a variável local x desse método
        System.out.printf("Local x before exiting method useLocalVariable is %d%n", x);

    }// useLocalVariable

    // modifica o campo x da classe Scope durante cada chamada
    public static void useField() {

        System.out.printf("%nField x on entering method useField is %d%n", x);
        x *= 10; // modifica o campo x da classe Scope
        System.out.printf("Field x before exiting method useField is %d%n", x);

    }// useField

}// Scope
