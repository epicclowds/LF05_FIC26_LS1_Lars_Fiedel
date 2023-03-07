package Aufgabe_7.A_7_2;

public class UEbung1 {

    // Aufgabe 1: Index
    public static void main1(String[] args) {
        int[] zahlen = {1, 6, 3, 7, 2};

        int i = 4;

        System.out.println(zahlen[1]); // 6
        System.out.println(zahlen[5]); // Fehler
        System.out.println(zahlen[3]); // 7
        System.out.println(zahlen[i]); // 2
        System.out.println(zahlen[i - 2]); // 3
        System.out.println(zahlen[zahlen[4]]); // 3
    }

    public static void main(String[] args) {
        int[] zahlen = {1, 6, 3, 7, 2, 2, 4, 8};

        for (int i = 2; i <= 3; i++) {
            System.out.print(zahlen[i] + ", "); // 3, 7, 1, 6, 3, 7, 2, 2, 4, 8, FEHLER
        }
        for (int i = 0; i <= zahlen.length; i++) {
            System.out.print(zahlen[i] + ", "); // 1, 6, 3, 7, 2, 2, 4, 8, FEHLER
        }
        for (int i = 1; i <= zahlen.length - 1; i = i + 2) {
            System.out.print(zahlen[i] + ", "); // 6, 7, 2, 8
        }
    }
}
