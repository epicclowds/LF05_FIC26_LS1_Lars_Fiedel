package Raumschiff_Ergaenzungsaktivitaeten.Aufgabe_1;

public class Start {

    public static void main(String[] args) {
        Kiste kiste1 = new Kiste(10, 5, 3, "Rot");
        Kiste kiste2 = new Kiste(8, 4, 6, "Blau");
        Kiste kiste3 = new Kiste(6, 7, 2, "Grün");

        System.out.println("Kiste 1 - Volumen: " + kiste1.getVolumen() + ", Farbe: " + kiste1.getFarbe());
        System.out.println("Kiste 2 - Volumen: " + kiste2.getVolumen() + ", Farbe: " + kiste2.getFarbe());
        System.out.println("Kiste 3 - Volumen: " + kiste3.getVolumen() + ", Farbe: " + kiste3.getFarbe());
    }

}
