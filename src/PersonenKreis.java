public class PersonenKreis {

    public static void personenEntfernen(int pN) {
        boolean[] ergebnis = new boolean[pN];

        for(int i=0; i<ergebnis.length; i++) {
            ergebnis[i] = true;
        }

        for(int lauf=0; anzahlNochDa(ergebnis)>2; lauf = naechsteVorhandene(lauf, ergebnis)) {
            int einsNaechster = naechsteVorhandene(lauf, ergebnis);
            lauf = naechsteVorhandene(einsNaechster, ergebnis);
            ergebnis[lauf] = false;
        }

        int person1 = 0;
        int person2 = 0;
        for(int i=0; i<ergebnis.length; i++) {
            if(ergebnis[i] && (person1 == 0)) {
                person1 = i+1;
            }
            else if(ergebnis[i]) {
                person2 = i+1;
            }
        }

        System.out.println("n=" +pN +": Person 1=" +person1 +", Person 2=" +person2);
    }

    public static int naechsteVorhandene(int pErst, boolean[] pArray) {
        for(int i = pErst+1; i!=pErst; i=(i+1)%pArray.length) {
            if(pArray[i%pArray.length]) {
                return i%pArray.length;
            }
        }
        return -1;
    }

    public static int anzahlNochDa(boolean[] pArray) {
        int ergebnis = 0;
        for(int i=0; i<pArray.length; i++) {
            if(pArray[i]) {
                ergebnis++;
            }
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        personenEntfernen(100);
    }
}
