// Figura 5.19: LogicalOperators.java
// Operadores lógicos.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_19_LogicalOperators_java;

public class LogicalOperatos {
    public static void main(String[] args) {

        // Tabela AND &&
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // Tabela OR ||
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // Tabela AND &
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));

        // Tabela OR |
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (|)",
                "false | false", (false || false),
                "false | true", (false || true),
                "true | false", (true || false),
                "true | true", (true || true));

        // Tabela ^ (OU exclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical exclusive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));

        // Tabela ! (negação lógica)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
                "!false", (!false), "!true", (!true));

    }// main

}// LogicalOperatos
