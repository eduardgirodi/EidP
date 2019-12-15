public class Artikel {



    private String name;
    private double preis;
    private int bestand;

    public Artikel(String pName, double pPreis, int pBestand) {
        this.name = pName;
        this.preis = pPreis;
        this.bestand = pBestand;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public int getBestand() {
        return bestand;
    }

    public void BestandDekr()
    {
        this.bestand--;
    }

    public void BestandInkr()
    {
        this.bestand++;
    }

    public double getRabattPreis(double rabatt)
    {
        double nachlass = this.preis*rabatt;
        return this.preis - nachlass;
    }
}
