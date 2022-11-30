import java.util.Scanner;

public class Fahrplan {
    public static void main(String[] args) {

        // Weichestellungen
        int fahrzeit = 0;

        System.out.println("Schreibe \"h\" für Hannover, schreibe \"2\" für Hamburg, schreibe \"w\" für Wolfsburg, schreibe \"b\" für Braunschweig");
        Scanner scanner = new Scanner(System.in);
        char endetIn = scanner.next().charAt(0);
        //char endetIn = 'h'; // h Hannover | w Wolfsburg | b Braunschweig

        char haltInSpandau = ' ';
        char richtungHamburg = ' ';
        char haltInStendal = ' ';
        char bisWolfsburg = ' ';
        char bisBraunschweig = ' ';

        if (endetIn == 'h') {
            haltInSpandau = 'n';
            richtungHamburg = 'n';
            haltInStendal = 'n';
            bisWolfsburg = 'n';
            bisBraunschweig = 'n';
        } else if (endetIn == 'w') {
            haltInSpandau = 'n';
            richtungHamburg = 'n';
            haltInStendal = 'n';
            bisWolfsburg = 'j';
            bisBraunschweig = 'n';
        } else if (endetIn == 'b') {
            haltInSpandau = 'n';
            richtungHamburg = 'n';
            haltInStendal = 'n';
            bisWolfsburg = 'n';
            bisBraunschweig = 'j';
        } else if (endetIn == '2') {
            haltInSpandau = 'n';
            richtungHamburg = 'j';
            haltInStendal = 'n';
            bisWolfsburg = 'n';
            bisBraunschweig = 'n';
        }


        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == 'j') {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }

        if (richtungHamburg == 'j') {
            fahrzeit = fahrzeit + 96; // Richtung Hamburg
        } else {
            fahrzeit = fahrzeit + 34;
            if (haltInStendal == 'j') {
                fahrzeit = fahrzeit + 16; // Halt in  Stendal
            } else {
                fahrzeit = fahrzeit + 6;
            }
            if (bisWolfsburg == 'j') {
                fahrzeit = fahrzeit + 29;
            } else {
                if (bisBraunschweig == 'j') {
                    fahrzeit = fahrzeit + 50;
                } else {
                    fahrzeit = fahrzeit + 62;
                }
            }

        }

        int stunden = fahrzeit / 60;
        int minuten = fahrzeit % 60;

        System.out.println("Die Fahrt nach Hannover endet in " + stunden + "h " + minuten + "min.");

    }

}