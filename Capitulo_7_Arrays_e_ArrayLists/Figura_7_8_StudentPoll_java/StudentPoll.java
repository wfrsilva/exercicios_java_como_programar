/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 200
// Figura 7.8: StudentPoll.java
// Programa de análise de enquete. 
O último valor no array é uma resposta intencionalmente incorreta (14). ArrayIndexOutOfBoundsException.*/
package Figura_7_8_StudentPoll_java;

public class StudentPoll {

    public static void main(String[] args) {
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } // try
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d %n %n", answer, responses[answer]);
            } // catch
        } // for

        System.out.printf("%s %10s %n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d %10d %n", rating, frequency[rating]);
        } // for

    }// main

}// StudentPoll
