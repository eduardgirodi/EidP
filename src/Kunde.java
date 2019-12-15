public class Kunde {

    private String vorname;
    private String nachname;

    public Kunde(String pVorname, String pNachname) {
        this.vorname = pVorname;
        this.nachname = pNachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
