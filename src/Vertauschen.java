public class Vertauschen {

    public static String[] vertauscheInhalt(String[] pArray) {
        String[] ergebnis = new String[pArray.length];
        for(int i=0;i<pArray.length;i++) {
            ergebnis[pArray.length-1-i] = new String(pArray[i]);
        }
        return ergebnis;
    }

    public static String[] vertauscheReferenz(String[] pArray) {
        String[] ergebnis = new String[pArray.length];
        for(int i=0;i<pArray.length;i++) {
            ergebnis[pArray.length-1-i] = pArray[i];
        }
        return ergebnis;
    }

    public static boolean testInhaltGleich(String[] arg1, String[] arg2) {
        for(int i=0;i<arg1.length;i++) {
            if(!arg1[i].equals(arg2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean testReferenzGleich(String[] arg1, String[] arg2) {
        for(int i=0;i<arg1.length;i++) {
            if(!(arg1[i]==arg2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) { }
}
