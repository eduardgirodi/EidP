public abstract class Gericht {

    private static int gesamtAnzahl;
    private double preis;

    public Gericht(double pPreis) {
        this.preis = pPreis;
        this.gesamtAnzahl++;
    }

    public double getPreis() {
        return this.preis;
    }

    public static int getGesamtAnzahl() {
        return gesamtAnzahl;
    }
}
