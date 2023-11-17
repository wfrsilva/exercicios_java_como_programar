/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 264
// Figura 8.11: EnumTest.java
// Testando o tipo enum Book.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_10_Book_java;

import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println("All books:");

        for (Book book : Book.values()) {
            // imprime todos os livros em enum Book
            System.out.printf("%-10s%-45s%s %n", book, book.getTitle(), book.getCopyrightYear());
        } // for

        System.out.printf("%nDisplay a range of enum constants:%n");

        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            // imprime os primeiros quatro livros
            System.out.printf("%-10s%-45s%s %n", book, book.getTitle(), book.getCopyrightYear());
        } // for

    }// main

}// EnumTest
