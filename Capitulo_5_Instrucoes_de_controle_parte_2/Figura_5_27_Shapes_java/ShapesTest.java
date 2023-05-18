// Figura 5.28: ShapesTest.java
// Obtendo a entrada de usuário e criando um JFrame para exibir Shapes.
package Capitulo_5_Instrucoes_de_controle_parte_2.Figura_5_27_Shapes_java;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

    public static void main(String [] args){
        String input = JOptionPane.showInputDialog(
            "Enter 1 to draw rectangles \n" +
            "Enter 2 to draw Ovals");
        
        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);

    }//main
    
}//ShapesTest
