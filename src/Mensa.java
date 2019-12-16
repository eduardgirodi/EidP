/** 
 * Mensa als Testprogramm
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class Mensa {
    public static void main(String[] args) {
        Salat salat = new Salat(253); // Salat mit 253 Gramm
        Hauptgericht hauptgericht = new Hauptgericht();
        Nachtisch nachtisch1 = new Nachtisch();
        Nachtisch nachtisch2 = new Nachtisch();

        double preis = salat.getPreis() + hauptgericht.getPreis() + nachtisch1.getPreis() + nachtisch2.getPreis();
        System.out.println("Gesamtpreis des Essens: " + preis);

        System.out.println("Anzahl verkaufter Salate: " + Salat.getAnzahl());
        System.out.println("Anzahl verkaufter Hauptgerichte: " + Hauptgericht.getAnzahl());
        System.out.println("Anzahl verkaufter Nachtische: " + Nachtisch.getAnzahl());

        // Beachten Sie, dass hier ueber eine Variable gegangen wird.
        // Das laesst Ihnen gewisse Freiheiten.
        System.out.println("Anzahl verkaufter Gerichte insgesamt: " + salat.getGesamtAnzahl());
    }
}
