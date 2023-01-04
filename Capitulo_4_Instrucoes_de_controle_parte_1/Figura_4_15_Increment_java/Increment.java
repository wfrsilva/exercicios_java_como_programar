/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 103
// Figura 4.15: Increment.java
// Operadores de pré-incremento e de pós-incremento.
*/
package Capitulo_4_Instrucoes_de_controle_parte_1.Figura_4_15_Increment_java;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("C before postincrement: %d%n", c);
        System.out.printf("   postincrementing C: %d%n", c++);
        System.out.printf("   C after postincrement: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf("C before preincrement: %d%n", c);
        System.out.printf("   preincrement C: %d%n", ++c);
        System.out.printf("   C after preincrement: %d%n", c); 
    }//main
    
}//Increment
