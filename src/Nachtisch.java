public class Nachtisch extends Gericht{

    private static int anzahl;

    public Nachtisch() {
        super(0.6);
        anzahl++;
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
