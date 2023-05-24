package Raumschiff_Ergaenzungsaktivitaeten.Aufgabe_2;

public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(int kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double betrag) {
        kapital += betrag;
    }

    public void hebeAb(double betrag) {
        if (betrag <= kapital) {
            kapital -= betrag;
        } else {
            System.out.println("Nicht genügend Guthaben.");
        }
    }

    public double getErtrag(int laufzeit) {
        double ertrag = kapital;
        for (int i = 0; i < laufzeit; i++) {
            ertrag += ertrag * (zinssatz / 100);
        }
        return ertrag;
    }

    public void verzinse() {
        kapital += kapital * (zinssatz / 100);
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }
}