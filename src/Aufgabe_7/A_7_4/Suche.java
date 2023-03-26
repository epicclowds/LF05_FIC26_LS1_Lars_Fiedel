package Aufgabe_7.A_7_4;

import java.util.Scanner;

public class Suche {


    public static void main(String[] args) {
        suche();
    }


    // A7.4.1: Array-Suche
    private static void suche() {

        Scanner tastatur = new Scanner(System.in);
        int[] zahlenArray = {33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
        boolean gefunden = false;
        int suchWert = tastatur.nextInt();

        System.out.print("Gebe den Wert ein, nach dem gesucht werden soll: ");

        for (int i = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] == suchWert) {
                gefunden = true;
                break;
            }
        }

        if (gefunden) {
            System.out.println("Gefunden.");
        } else {
            System.out.println("Nicht gefunden.");
        }
    }

}