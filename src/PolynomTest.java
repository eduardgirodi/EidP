public class PolynomTest {

    public static void main(String[] args) {
        double[] test = {3d, 2d, 1d};
        Polynom pol1 = new Polynom(test);
        System.out.println(pol1.toString());
        System.out.println(pol1.auswerten(2));
        System.out.println(pol1.getAnzahl());
    }
}
