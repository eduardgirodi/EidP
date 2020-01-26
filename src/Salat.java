public class Salat extends Gericht {

    private int gewicht;
    private static int anzahl;

    public Salat(int pGewicht) {
        super((0.3/100)*pGewicht);
        this.gewicht = pGewicht;
        anzahl++;
    }

    public void wuerzen(String gewuerz) {
        System.out.println("Salat wird gewuerzt mit " +gewuerz);
    }

    public void zubereiten() {
        System.out.println("Salat wird zubereitet");
    }

    public int getGewicht() {
        return this.gewicht;
    }

    public static int getAnzahl() {
        return anzahl;
    }
}
