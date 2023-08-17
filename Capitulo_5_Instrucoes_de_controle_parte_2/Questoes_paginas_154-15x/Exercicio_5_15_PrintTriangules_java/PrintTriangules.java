package Exercicio_5_15_PrintTriangules_java;
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
//pagina 154  
5.15 (Programa para impressão de triângulos) Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro.
Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na forma System.out.
print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma System.out.println(); pode
ser utilizada para mover-se para a próxima linha. Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir
um espaço para os últimos dois padrões. Não deve haver outras instruções de saída no programa. [Dica: os dois últimos padrões requerem
que cada linha inicie com um número adequado de espaços em branco.]

5.15 (Program for Printing Triangles) Write an application that prints the following patterns separately, one under the other.
Use for loops to generate the patterns. All asterisks (*) must be printed by a single statement of the form System.out.
print('*'); which causes the asterisks to print side by side. A statement of the form System.out.println(); he can
be used to move to the next line. A statement of the form System.out.print(' '); can be used to display
a space for the last two patterns. There must be no other output statements in the program. [Hint: The last two patterns require
that each line starts with an adequate number of white spaces.]*/

public class PrintTriangules {

    public static void main(String[] args) {
        int line = 1;
        int col = 1;
        for (int l = 1; l <= line; l++) {
            for (int c = 1; c <= col; c++) {

                System.out.print("*");
                if (col < 10) {
                    col++;
                } // if

            } // for

            System.out.println();
            if (line < 10) {
                line++;
            } // if

        } // for

    }// main

}// PrintTriangules
