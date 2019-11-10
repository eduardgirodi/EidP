import java.util.Scanner;

public class IbanBerechnen {

    //Normiert die Laenderkennung zu Grossbuchstaben
    public static String normLaenderkennung(String pLaenderkennung) {
        return pLaenderkennung.toUpperCase();
    }

    //Normiert die Kontonummer, indem vorne Nullen eingeschoben werden
    public static String normKontoNr(String pKontoNummer) {
        while (pKontoNummer.length() < 10) {
            pKontoNummer = "0" + pKontoNummer;
        }
        return pKontoNummer;
    }

    //Erzeugt BBAN aus normierter Konto Nr. und BLZ
    public static String bbanErzeugen(String pNormKontoNr, String pBlz) {
        return pBlz + pNormKontoNr;
    }

    //Generiert String mithilfe von normierter Laenderkennung und BLZ. Wird fuer die pruefzahl benoetigt
    public static String umwandlung(String pNormLaenderkennung, String pBban) {
        int ersterBuchstabe;
        int zweiterBuchstabe;
        char c = pNormLaenderkennung.charAt(0);
        ersterBuchstabe = (c - 'A') + 10;
        c = pNormLaenderkennung.charAt(1);
        zweiterBuchstabe = (c - 'A') + 10;
        return pBban +ersterBuchstabe +zweiterBuchstabe +"00";
    }

    //Die Pruefzahl wird mithilfe des uebergebenen String erzeugt
    public static String pruefzahl(String pLongCode) {
        int tempPruefzahl;
        while(pLongCode.length()>9){
            tempPruefzahl = Integer.parseInt(pLongCode.substring(0, 9)) % 97;
            pLongCode = tempPruefzahl +pLongCode.substring(9);
        }
        tempPruefzahl = Integer.parseInt(pLongCode) % 97;
        int ergebnis = 98 - tempPruefzahl;
        if(ergebnis<10) {
            return "0" + ergebnis;
        }
        else{
            return Integer.toString(ergebnis);
        }
    }

    //IBAN wird mithilfe von BLZ und unnormierten Laenderkennung und Konto Nr. erzeugt
    public static String erzeugeIban(String laenderkennung, String blz, String nummer) {
        String land = normLaenderkennung(laenderkennung);
        String bban = bbanErzeugen(normKontoNr(nummer),blz);
        String pruefZahl = pruefzahl(umwandlung(normLaenderkennung(laenderkennung),bban));

        return land +pruefZahl +bban;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String laenderkennung = sc.next();
        String blz = sc.next();
        String kontoNummer = sc.next();
        sc.close();
        System.out.println(erzeugeIban(laenderkennung, blz, kontoNummer));
    }
}
