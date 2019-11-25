public class PersonenKreis {

    public static void gehen(int pN) {
        boolean[] ergebnis = new boolean[pN];
        int count = 0;

        for(int i=0; i<ergebnis.length; i++) {
            ergebnis[i]=true;
        }

        int j = 0;
        while(anzahlNochDa(ergebnis)>2) {
            int einsNaechster = naechsteVorhandene(j, ergebnis);
            j = naechsteVorhandene(einsNaechster, ergebnis);
            ergebnis[j] = false;
        }




        for(int i=0; i<ergebnis.length; i++) {
            System.out.println(ergebnis[i]);
        }
    }

    public static int naechsteVorhandene(int pErst, boolean[] pArray) {
        int run = (pErst+1)%pArray.length;
        int count = 0;

        while(count<pArray.length) {
            int lauf = run%(pArray.length);
            if(pArray[lauf]) {
                return lauf;
            }
            else {
                run++;
                count++;
            }
        }
        System.out.println(run +" " +count);
        return 1;
    }

    public static int anzahlNochDa(boolean[] pArray) {
        int ergebnis = 0;
        for(int i=0; i<pArray.length; i++) {
            if(pArray[i]==true);
            ergebnis++;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        gehen(10);
    }
}
