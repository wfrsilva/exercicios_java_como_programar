/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 252
// Figura 8.3: MemberAccessTest.java
// Membros privados da classe Time1 não são acessíveis.*/
package Capitulo_8_Classes_e_objetos_um_exame_mais_profundo.Figura_8_1_Time1_java;

public class MemberAccessTest {

    public static void main(String[] args) {
        Time1 time = new Time1();

        time.hour = 7; // erro: hour tem acesso privado em Time1
        time.minute = 15; // erro: minute tem acesso privado em Time1ÿÿ
        time.second = 30; // erro: second tem acesso privado em Time1

    }// main

}// MemberAccessTest
