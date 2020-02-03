public class TestKlasse2 {
    public static void main(String[] args) {
        System.out.println(gibZahl(4711));
    }

    // in dieser Methode duerfen Sie Ergaenzungen vornehmen
    private static String gibZahl(int wert) {

        ZahlKlasse z = new ZahlKlasse(wert) {
            @Override
            public String toString() {
                return "" +this.getZahl()*2;
            }
        };
        return z.toString();
    }
}
