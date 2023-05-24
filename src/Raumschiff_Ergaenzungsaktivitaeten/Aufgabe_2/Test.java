package Raumschiff_Ergaenzungsaktivitaeten.Aufgabe_2;

public class Test {

    public static void main(String[] args) {
        Sparbuch sb = new Sparbuch(1104711, 1000, 3);
        sb.zahleEin(60000);
        System.out.println("Kapital: " + sb.getKapital());
        System.out.println("Ertrag nach 6 Jahren: " + sb.getErtrag(6));
        sb.verzinse();
        System.out.println("Kapital: " + sb.getKapital());
    }

}
