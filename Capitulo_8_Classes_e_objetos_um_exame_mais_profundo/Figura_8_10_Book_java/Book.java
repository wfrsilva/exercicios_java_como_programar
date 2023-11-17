/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 262
// Figura 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de instância explícitos
// e métodos de acesso para esses campos*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_10_Book_java;

public enum Book {

    // declara constantes do tipo enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // campos de instância
    private final String title; // título do livro
    private final String copyrightYear; // ano dos direitos autorais

    Book(String title, String copyrightYear) {
        // construtor enum
        this.title = title;
        this.copyrightYear = copyrightYear;

    }// construtor enum

    public String getTitle() {
        // acessor para título de campo
        return title;
    }// getTitle

    public String getCopyrightYear() {
        // acessor para o campo copyrightYear
        return copyrightYear;
    }// getCopyrightYear

}// enum Book
