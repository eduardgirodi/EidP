public abstract class Gericht implements Zubereiten{

    private static int gesamtAnzahl;
    private double preis;
    public abstract void wuerzen(String gewuerz);
    public abstract void zubereiten();

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
