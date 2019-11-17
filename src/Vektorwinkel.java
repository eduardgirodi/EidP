public class Vektorwinkel {

    public static double winkel(double[] a, double[] b) {
        return winkelRad(a, b)*180/Math.PI;
    }

    public static double winkelRad(double[] pA, double[] pB) {
        return Math.acos(skalarProdukt(pA, pB)/(norm(pA)*norm(pB)));
    }

    public static double skalarProdukt(double[] pA, double[] pB) {
        double ergebnis = 0;
        for(int i=0; i<pA.length; i++) {
            ergebnis += pA[i] * pB[i];
        }
        return ergebnis;
    }

    public static double norm(double[] pVektor) {
        return Math.sqrt(skalarProdukt(pVektor, pVektor));
    }

    public static void main(String[] args) {
    }
}
