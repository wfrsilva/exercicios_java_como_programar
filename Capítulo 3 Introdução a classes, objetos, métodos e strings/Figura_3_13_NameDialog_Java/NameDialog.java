/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 72
// Figura 3.13: NameDialog.Java
// Obtendo a entrada de usuário a partir de um diálogo. */
package Figura_3_13_NameDialog_Java;

import javax.swing.JOptionPane;

public class NameDialog {

    public static void main (String [] args){

       String name = JOptionPane.showInputDialog("What is your name?");
       
       String message = String.format("Welcome, %s, to Java Programing!", name);

       JOptionPane.showMessageDialog(null, message);

    }//main
    
}//NameDialog
