public class KomplexeZahl extends Zahl {

    private double a;
    private double b;

    public KomplexeZahl(double pA, double pB) {
        this.a = pA;
        this.b = pB;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public Zahl addieren(Zahl pZahl) {
        this.a += ((KomplexeZahl) pZahl).getA();
        this.b += ((KomplexeZahl) pZahl).getB();
        return this;
    }

    @Override
    public Zahl subtrahieren(Zahl pZahl) {
        this.a -= ((KomplexeZahl) pZahl).getA();
        this.b -= ((KomplexeZahl) pZahl).getB();
        return this;
    }

    @Override
    public Zahl multiplizieren(Zahl pZahl) {
        double a = this.a;
        double b = this.b;
        double c = ((KomplexeZahl) pZahl).getA();
        double d = ((KomplexeZahl) pZahl).getB();
        this.a = (a*c)-(b*d);
        this.b = (a*d)+(b*c);
        return this;
    }

    @Override
    public Zahl dividieren(Zahl pZahl) {
        double a = this.a;
        double b = this.b;
        double c = ((KomplexeZahl) pZahl).getA();
        double d = ((KomplexeZahl) pZahl).getB();
        if(c!=0 || d!=0) {
            this.a = ((a*c)+(b*d))/((c*c)+(d*d));
            this.b = ((b*c)-(a*d))/((c*c)+(d*d));
        }
        return this;
    }

    @Override
    public String toString() {
        return this.a +"+" +this.b +"*i";
    }
}
