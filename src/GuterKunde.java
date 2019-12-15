public class GuterKunde extends Kunde {

    private double rabatt;

    public GuterKunde(String pVorname, String pNachname, double pRabatt) {
        super(pVorname, pNachname);
        this.rabatt = pRabatt;
    }

    public double getRabatt() {
        return rabatt;
    }
}
