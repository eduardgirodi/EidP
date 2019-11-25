public class Zahlendarstellung {

    public static int ermittleLaenge(int x, int b) {
        int count = 0;
        while(x >= 1) {
            count++;
            x = x/b;
        }
        return count;
    }

    public static int[] ermittleZiffern(int x, int b) {
        if(x==0) {
            int[] ergebnis = {0};
            return ergebnis;
        }

        int[] ergebnis = new int[ermittleLaenge(x,b)];

        for(int i=0; x>=1; i++) {
            ergebnis[i] = x%b;
            x = x/b;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
    }
 }
