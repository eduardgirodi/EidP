public class Klausurnoten {

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punkteGrenzen) {
        System.out.println(anzahlTeilnehmer(punkte));
        System.out.println(randNoten(punkte,punkteGrenzen)[0] +" " +randNoten(punkte,punkteGrenzen)[1]);
        System.out.println(anzahlBestandenUndNicht(punkte,punkteGrenzen)[0] +" " +anzahlBestandenUndNicht(punkte,punkteGrenzen)[1]);
        System.out.println(durchschnitt(punkte));
        for(int i=1;i<6;i++) {
            System.out.println(i +" " +histogramm(i, punkte, punkteGrenzen));
        }
    }

    public static int anzahlTeilnehmer(int[] pPunkte) {
        return pPunkte.length;
    }

    public static int[] randNoten(int[] pPunkte, int[] pPunkteGrenzen) {
        int[] ergebnis = {6, 0};
        for(int i=0; i<pPunkte.length; i++) {
            if(gibNote(pPunkte[i],pPunkteGrenzen)<ergebnis[0]) {
                ergebnis[0] = gibNote(pPunkte[i],pPunkteGrenzen);
            }
            if(gibNote(pPunkte[i],pPunkteGrenzen)>ergebnis[1]) {
                ergebnis[1] = gibNote(pPunkte[i],pPunkteGrenzen);
            }
        }
        return ergebnis;
    }

    public static double durchschnitt(int[] pPunkte) {
        double gesamt = 0.0;
        for(int i=0; i<pPunkte.length; i++) {
            gesamt += pPunkte[i];
        }
        return gesamt/pPunkte.length;
    }

    public static int histogramm(int pNote, int[] pPunkte, int[] pPunkteGrenzen) {
        int count = 0;
        for(int i=0; i<pPunkte.length; i++) {
            if(gibNote(pPunkte[i],pPunkteGrenzen) == pNote) {
                count++;
            }
        }
        return count;
    }

    public static int[] anzahlBestandenUndNicht(int[] pPunkte, int[] pPunkteGrenzen) {
        int[] ergebnis = {0, 0};
        for(int i=0; i<pPunkte.length; i++) {
            if(gibNote(pPunkte[i], pPunkteGrenzen)<4 || gibNote(pPunkte[i], pPunkteGrenzen)==4) {
                ergebnis[0]++;
            }
            else {
                ergebnis[1]++;
            }
        }
        return ergebnis;
    }

    public static int gibNote(int pPunkte, int[] pPunkteGrenzen) {  //Methode gibt die Note einer uebergebenen Punktzahl zurueck
        if(pPunkte<pPunkteGrenzen[0]) {
            return 5;
        }
        else if(pPunkte>pPunkteGrenzen[0] && pPunkte<pPunkteGrenzen[1]) {
            return 4;
        }
        else if(pPunkte>pPunkteGrenzen[1] && pPunkte<pPunkteGrenzen[2]) {
            return 3;
        }
        else if(pPunkte>pPunkteGrenzen[2] && pPunkte<pPunkteGrenzen[3]) {
            return 2;
        }
        else if(pPunkte>pPunkteGrenzen[3]) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}
