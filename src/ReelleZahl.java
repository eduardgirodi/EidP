public class ReelleZahl extends Zahl {

    private double wert;

    public ReelleZahl(double pWert) {
        this.wert = pWert;
    }

    public double getWert() {
        return this.wert;
    }

    @Override
    public Zahl addieren(Zahl pZahl) {
        this.wert += ((ReelleZahl) pZahl).getWert();
        return this;
    }

    @Override
    public Zahl subtrahieren(Zahl pZahl) {
        this.wert -= ((ReelleZahl) pZahl).getWert();
        return this;
    }

    @Override
    public Zahl multiplizieren(Zahl pZahl) {
        this.wert *= ((ReelleZahl) pZahl).getWert();
        return this;
    }

    @Override
    public Zahl dividieren(Zahl pZahl) {
        if(((ReelleZahl) pZahl).getWert() != 0) {
            this.wert /= ((ReelleZahl) pZahl).getWert();
        }
        return this;
    }

    @Override
    public String toString() {
        return "" +this.wert;
    }
}
