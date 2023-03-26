package Aufgabe_7.A_7_2;

import java.util.Arrays;

public class ArrayUebung {


    public static void main(String args[]) {

        // 1. Deklaration eines Arrays für ganze Zahlen.
        int[] numbers;

        // 2. Initialisierung des Arrays mit 100 Elementen.
        numbers = new int[100];

        // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i);
        }

        // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        // 5. Geben Sie den Wert an der 89. Position des Arrays aus.
        System.out.println(numbers[89]);

        // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
        numbers[48] = 1060;

        // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
        numbers[0] = 2023;
        numbers[99] = 2023;

        // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)

        for (int i = 0; i< numbers.length; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        // 8. Berechnung des Durchschnitts aller Arrayelemente
        int summe = 0;
        double durchschnitt = 0.0;

        for (int i = 0; i< numbers.length; i++){
             summe += numbers[i];
        }

        durchschnitt = (double) summe / numbers.length;

        System.out.println(durchschnitt);

    }


}
