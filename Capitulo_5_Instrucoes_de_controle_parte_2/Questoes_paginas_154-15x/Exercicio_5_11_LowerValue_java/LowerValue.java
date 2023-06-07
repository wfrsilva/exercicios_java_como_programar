
/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 154 
//5.11 (Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. 
//Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário.*/
import java.util.Scanner;

public class LowerValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite nros de valores: ");
        int qtyValues = input.nextInt();
        System.out.print("Digite o 1º valor: ");
        int lowerValue = input.nextInt();

        for (int i = 2; i <= qtyValues; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int currentValue = input.nextInt();

            if (currentValue < lowerValue) {
                lowerValue = currentValue;
            } // if

        } // for

        System.out.printf("O menor valor informado é %d", lowerValue);

        input.close();

    }// main

}// LowerValue
