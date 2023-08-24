/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 177
// Figura 6.10: MethodOverload.java
// Declarações de métodos sobrecarregados.
// Overloaded method declarations. */
package Figura_6_10_MethodOverload_java;

public class OverloadMetodo {

    public static void main(String[] args) {
        System.out.printf("Raiz quadrada do inteiro 7 é %d%n", raizQuadrada(7));
        System.out.printf("Raiz quadrada do Double 7.5 é %f%n", raizQuadrada(7.5));
    }// main

    public static int raizQuadrada(int valorInt) {
        System.out.printf("%nRaiz quadrada chamada com argumento int: %d%n", valorInt);
        return valorInt * valorInt;
    }// raizQuadrada

    public static double raizQuadrada(double valorDouble) {
        System.out.printf("%nRaiz quadrada chamada com argumento double: %f%n", valorDouble);
        return valorDouble * valorDouble;
    }// raizQuadrada

}// OverloadMetodo
