public class Eratosthenes {

    private static int N = 1000;

    public static int[] eratosthenes(int pMax) {
        int primCount = 0;
        boolean[] prim = new boolean[pMax];

        for(int i=2; i<prim.length; i++) {
            prim[i] = true;
        }

        for(int i=2; i<prim.length; i++) {
            if(prim[i]) {
                primCount++;
                for(int j=i+i; j<prim.length; j+=i) {
                    prim[j] = false;
                }
            }
        }

        int[] ergebnis = new int[primCount];
        primCount = 0;

        for(int i=2; i<prim.length; i++) {
            if(prim[i]) {
                ergebnis[primCount] = i;
                primCount++;
            }
        }

        return ergebnis;
    }

    public static String printPrimArray(int[] pArray) {
        String ergebnis = pArray.length +" Primzahlen: ";

        for(int i=0; i<pArray.length; i++) {
            if(i==0) {
                ergebnis += pArray[i];
            }
            else {
                ergebnis += ", " +pArray[i];
            }
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int[] test = eratosthenes(N);
        System.out.println(printPrimArray(test));
    }
}
