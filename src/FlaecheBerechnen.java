public class FlaecheBerechnen {

    public static float flaecheBerechnen(float[][] coord) {
        int n = coord.length;
        float summeGesamt = 0.0f;
        for(int i=0;i<n;i++) {
            float addition = coord[i][0]+coord[((i+1)%n)][0];
            float subtraktion = coord[(i+1)%n][1]-coord[i][1];
            float multiplikation = addition*subtraktion;
            summeGesamt += multiplikation;
        }
        return Math.abs(summeGesamt/2.0f);
    }

    public static void main(String[] args) {
    }
}
