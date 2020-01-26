/** 
 * Mensa als Testprogramm
 * @author Rudolf Berrendorf
 * @version 1.0
 */
public class Mensa {
    public static void main(String[] args) {
        //Test Nr. 5
        Salat salat1 = new Salat(253); // Salat mit 253 Gramm
        Hauptgericht hauptgericht1 = new Hauptgericht();
        Nachtisch nachtisch1 = new Nachtisch();
        Nachtisch nachtisch2 = new Nachtisch();

        double preis = salat1.getPreis() + hauptgericht1.getPreis() + nachtisch1.getPreis() + nachtisch2.getPreis();
        System.out.println("Gesamtpreis des Essens: " + preis);

        System.out.println("Anzahl verkaufter Salate: " + Salat.getAnzahl());
        System.out.println("Anzahl verkaufter Hauptgerichte: " + Hauptgericht.getAnzahl());
        System.out.println("Anzahl verkaufter Nachtische: " + Nachtisch.getAnzahl());

        // Beachten Sie, dass hier ueber eine Variable gegangen wird.
        // Das laesst Ihnen gewisse Freiheiten.
        System.out.println("Anzahl verkaufter Gerichte insgesamt: " +salat1.getGesamtAnzahl());

        //Test Nr. 6
        Gericht salat2 = new Salat(300);
        Gericht hauptgericht2 = new Hauptgericht();

        //Gerichte zubereiten und wuerzen
        salat2.zubereiten();
        salat2.wuerzen("Oregano");
        hauptgericht2.zubereiten();
        hauptgericht2.wuerzen("Salz");

        //Koch und Spueler erzeugen
        Person koechin = new Koch("Renate", "Gutkoch");
        Person spueler = new Spueler("Fritz", "Spueli");
        System.out.println(koechin);
        System.out.println(spueler);

        //Gesamtkosten berechnen
        System.out.println("Pro Stunde sind faellig " +(koechin.getStundenlohn() +spueler.getStundenlohn()) +" Euro");
    }
}
