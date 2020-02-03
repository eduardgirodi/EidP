public class Polynom {

    private double[] koeffizientenArray;
    private static int polynomAnzahl;

    public Polynom(double[] koeffizienten) {
        if(koeffizienten.length == 0) {
            System.out.println("Keine Koeffizienten übergeben.");
            return;
        }
        if(getNormLength(koeffizienten)==0) {
            koeffizientenArray = koeffizienten;
        }
        else {
            koeffizientenArray = new double[getNormLength(koeffizienten)];
            for(int i=0; i<koeffizientenArray.length; i++) {
                koeffizientenArray[i] = koeffizienten[i];
            }
        }
        polynomAnzahl++;
    }

    public static int getNormLength(double[] pKoeffizienten) {
        int ergebnis = 0;
        boolean normalisiert = false;
        for(int i = pKoeffizienten.length-1; i>=0; i--) {
            if(pKoeffizienten[i] == 0.0 && normalisiert) {
                ergebnis++;
            }
            else if(pKoeffizienten[i] != 0.0) {
                normalisiert = true;
                ergebnis++;
            }
        }
        return ergebnis;
    }

    public String toString() {
        String ergebnis = "";
        for(int i=koeffizientenArray.length-1; i>=0; i--) {
            if(i==0) {
                ergebnis += "" + koeffizientenArray[i] + "*x^" + i;
            }
            else {
                ergebnis += "" + koeffizientenArray[i] + "*x^" + i + " + ";
            }
        }
        return ergebnis;
    }

    public double auswerten(double x) {
        double ergebnis = 0.0;
        for(int i=koeffizientenArray.length-1; i>=0; i--) {
            ergebnis += koeffizientenArray[i]*Math.pow(x,i);
        }
        return ergebnis;
    }

    public static int getAnzahl() {
        return polynomAnzahl;
    }
}
