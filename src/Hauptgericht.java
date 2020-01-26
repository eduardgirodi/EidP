public class Hauptgericht extends Gericht {

    private static int anzahl;

    public Hauptgericht() {
        super(2.9);
        anzahl++;
    }

    public void wuerzen(String gewuerz) {
        System.out.println("Hauptgericht wird gewuerzt mit " +gewuerz);
    }

    public void zubereiten() {
        System.out.println("Hauptgericht wird zubereitet");
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
