/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 226
// Figura 7.24: ArrayListCollection.java
// Demonstração da coleção ArrayList<T> genérica.*/
package Figura_7_24_ArrayListCollection_java;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print("Display list contents with counter controlled loop: ");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        } // for

        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements: ");

        items.remove("yellow"); // remove o primeiro "yellow"
        display(items, "remove first instance of yellow: ");

        items.remove(1); // remove o item no índice 1
        display(items, "Remove second list element (green): ");

        // verifica se um valor está na List
        System.out.printf("\"red\" is %sin the list %n", items.contains("red") ? "" : "not ");

        System.out.printf("Size: %s %n", items.size());

    }// main

    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header);

        for (String item : items) {
            System.out.printf(" %s", item);
        } // for

        System.out.println();

    }// display

}// ArrayListCollection
