public class Nachtisch extends Gericht{

    private static int anzahl;

    public Nachtisch() {
        super(0.6);
        anzahl++;
    }

    public void wuerzen(String pGewuerz) {
        System.out.println("Nachtisch wird gewuerzt mit " +pGewuerz);
    }

    public void zubereiten() {
        System.out.println("Nachtisch wir zubereitet");
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
