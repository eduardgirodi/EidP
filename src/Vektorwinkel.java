public class Vektorwinkel {

    public static double winkel(double[] a, double[] b) {   //Errechnet und gibt Winkel zwischen zwei Vektoren in Grad aus
        return winkelRad(a, b)*180/Math.PI;
    }

    public static double winkelRad(double[] pA, double[] pB) {  //Errechnet und gibt Winkel zwischen zwei Vektoren in Radiant aus
        return Math.acos(skalarProdukt(pA, pB)/(norm(pA)*norm(pB)));
    }

    public static double skalarProdukt(double[] pA, double[] pB) {  //Errechnet und gibt das Skalarprodukt zweier Vektoren aus
        double ergebnis = 0;
        for(int i=0; i<pA.length; i++) {
            ergebnis += pA[i] * pB[i];
        }
        return ergebnis;
    }

    public static double norm(double[] pVektor) {   //Errechnet und gibt die Norm eines Vektors aus
        return Math.sqrt(skalarProdukt(pVektor, pVektor));
    }

    public static void main(String[] args) {
    }
}
