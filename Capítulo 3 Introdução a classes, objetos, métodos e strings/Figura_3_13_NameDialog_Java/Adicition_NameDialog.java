/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição.pdf 
pagina 73
Exercício do estudo de caso GUI e imagens gráficas
3.1 Modifique o programa de adição na Figura 2.7 (Pag 36 - Addition.java) para utilizar entrada e saída baseadas em caixas de diálogo com os métodos
da classe JOptionPane. 
Uma vez que o método showInputDialog retorna uma String, você deve converter a String que
o usuário insere em um int para utilização em cálculos. O método static parseInt da classe Integer (pacote java.
lang) recebe um argumento String que representa um inteiro e retorna o valor como um int. Se a String não contiver
um inteiro válido, o programa terminará com um erro. 
Java como programar 10 edição - Pag 36 - Addition.java : https://www.sololearn.com/compiler-playground/ccEU80u8Q9Pa */

package Figura_3_13_NameDialog_Java;

import javax.swing.JOptionPane;

public class Adicition_NameDialog {

    public static void main (String [] args){

        int number1;
        int number2;
        int sum;

        String strNmb1;
        String strNmb2;
        String message;

        strNmb1 = JOptionPane.showInputDialog("Enter first integer: ");
        strNmb2 = JOptionPane.showInputDialog("Enter second integer: " );

        number1 = Integer.parseInt(strNmb1);
        number2 = Integer.parseInt(strNmb2);
        sum = number1 + number2;

        message = String.format("Sum of %d and %d is %d%n", number1, number2, sum);
        JOptionPane.showMessageDialog(null, message);


    }//main
    
}//Adicition_NameDialog
