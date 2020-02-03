public abstract class ZahlKlasse implements ZahlFunktionalitaet {
    private int zahl;

    public ZahlKlasse(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }

    public String toString() {
        return "" +zahl;
    }
}
