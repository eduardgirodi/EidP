public abstract class Person {

    private String vorname;
    private String nachname;
    private String beruf;
    private double stundenlohn;

    public Person(String pVorname, String pNachname) {
        this.vorname = pVorname;
        this.nachname = pNachname;
    }

    public void setBeruf(String pBeruf) {
        this.beruf = pBeruf;
    }

    public void setStundenlohn(double pStundenlohn) {
        this.stundenlohn = pStundenlohn;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public String toString() {
        return this.beruf +" " +this.vorname +" " +this.nachname +" bekommt " +this.stundenlohn +" Euro";
    }
}
