package Aufgabe_6.A_6_2;

import java.util.Scanner;

public class Willkommen {

    public static void main(String[] args) {

        double zuZahlenderBetrag;
        double eingezahlterGesamtbetrag;
        Scanner tastatur = new Scanner(System.in);

        begreussung();
        zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
        eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
        fahrkartenAusgeben();
        rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
    }

    // Willkommen - Aufgabe 6.2.1
    private static void begreussung() {
        System.out.println("Herzlich Willkommen!");
        System.out.println("\nWählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
        System.out.println("Kurzstrecke AB [2,00 EUR] (1)");
        System.out.println("Einzelfahrschein AB [3,00 EUR] (2)");
        System.out.println("Tageskarte Regeltarif AB [8,80 EUR] (3)");
        System.out.println("4-Fahrten-Karte AB [9,40 EUR] (4)");
    }

    // Erfassen der Fahrkartenbestellung - Aufgabe 6.2.2
    public static double fahrkartenbestellungErfassen(Scanner tastatur) {

        double zuZahlenderBetrag;
        double ticketPreis;
        double anzahlTickets;

        int auswahl = tastatur.nextInt();

        if (auswahl == 1) {
            ticketPreis = 2.00;
        } else if (auswahl == 2) {
            ticketPreis = 3.00;
        } else if (auswahl == 3) {
            ticketPreis = 8.80;
        } else if (auswahl == 4) {
            ticketPreis = 9.40;
        } else {
            ticketPreis = 0;
            System.out.println("Fehler!\nVersuche es erneut");
        }

        System.out.println("Wie viele Tickets?");
        anzahlTickets = tastatur.nextDouble();

        zuZahlenderBetrag = ticketPreis * anzahlTickets;

        System.out.println(Math.round(zuZahlenderBetrag * 100.0) / 100.0 + "0" + "€");

        return zuZahlenderBetrag;
    }

    // Geldeinwurf - Aufgabe 6.2.3
    public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {

        zuZahlenderBetrag = 10;

        return zuZahlenderBetrag;
    }

    // Fahrkartenausgabe - Aufgabe 6.2.4
    public static void fahrkartenAusgeben() {
        System.out.println("\nFahrschein wird ausgegeben");
        System.out.println("========");
    }

    // Rückgeldausgabe - Aufgabe 6.2.5
    public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag){

    }

}