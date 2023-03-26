package Aufgabe_7.A_7_4;

import java.util.HashMap;

public class Zahlen {

    // A7.4.2: Häufigste Zahl
    public static void main(String[] args) {
        int[] zahlen = {3, 4, 2, 3, 5, 1, 2, 7, 2, 1, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int frequentNumber = 0;

        for (int i = 0; i < zahlen.length; i++) {
            int currentCount = map.getOrDefault(zahlen[i], 0) + 1;
            map.put(zahlen[i], currentCount);

            if (currentCount > maxCount) {
                maxCount = currentCount;
                frequentNumber = zahlen[i];
            }
        }

        System.out.println("Häufigste Zahl: " + frequentNumber + " (" + maxCount + " Vorkommen)");
    }

}
