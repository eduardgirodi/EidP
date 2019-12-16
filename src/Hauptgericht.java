public class Hauptgericht extends Gericht {

    private static int anzahl;

    public Hauptgericht() {
        super(2.9);
        anzahl++;
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
