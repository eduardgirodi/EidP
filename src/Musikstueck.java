public class Musikstueck {

    String[] interpreten = new String[0];
    String titel;
    int[] toene;
    int anzahlEinzelBewertungen;
    int gesamtBewertung = 0;
    String ton = "";
    String interpret = "";

    public Musikstueck(String[] interpreten, String titel, int[] toene) {
        this.interpreten = interpreten;
        for(int i=0; i<interpreten.length; i++) {
            interpret += interpreten[i] +", ";
        }
        this.titel = titel;
        this.toene = toene;
        for(int i=0; i<toene.length; i++) {
            ton += toene[i] +" ";
        }
    }

    public void abspielen() {
        System.out.println(ton);
    }

    public void neueBewertung(int bewertung) {
        anzahlEinzelBewertungen++;
        gesamtBewertung = (gesamtBewertung*anzahlEinzelBewertungen)+bewertung;
        gesamtBewertung = Math.round(gesamtBewertung/anzahlEinzelBewertungen);
    }

    public int getGesamtbewertung() {
        return gesamtBewertung;
    }

    public String toString() {
        return "Interpreten: " +interpret +"Titel: " +titel +", " +"Toene: " +ton +", " +"Anz. Bewertungen: " +anzahlEinzelBewertungen +", "+"Gesamtbewertung: " +getGesamtbewertung();
    }

    public static void main(String[] args) {
        String[] interpreten1 = {"wham"};
        String[] interpreten2 = {"Koelner Domspatzen", "Heino"};
        int[] toene1 = {1, 2, 3, 4, 5, 6};
        int[] toene2 = {6, 5, 4, 3, 2, 1};

        Musikstueck m1 = new Musikstueck(interpreten1, "Last Christmas", toene1);
        Musikstueck m2 = new Musikstueck(interpreten2, "O Tannenbaum", toene2);

        m1.abspielen();
        m1.neueBewertung(1);
        m1.neueBewertung(1);
        m1.neueBewertung(3);
        System.out.println(m1);
        System.out.println(m2);
    }
}
