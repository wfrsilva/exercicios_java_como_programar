/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 269
// Figura 8.14: StaticImportTest.java
// Importação static dos métodos da classe Math. */

package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_14_StaticImportTest_java;

import static java.lang.Math.*;

public class StaticImportTest {

    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f %n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f %n", ceil(-9.8));
        System.out.printf("E = %f %n", E);
        System.out.printf("PI = %f %n", PI);
    }// main

}// StaticImportTest