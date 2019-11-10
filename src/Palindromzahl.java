public class Palindromzahl {

    public static int spiegeln(int zahl) {
        int ergebnis = 0;
        int potenz;
        for(int i=(int)Math.log10(zahl); zahl!=0; i--) {
            potenz = zahl%10;
            zahl = zahl/10;
            ergebnis += potenz*(int)Math.pow(10,i);
        }
        return ergebnis;
    }

    public static int spiegelAddieren(int zahl) {
        return spiegeln(zahl)+zahl;
    }

    public static boolean palindromTest(int zahl) {
        if(spiegeln(zahl)==zahl) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        System.out.println(spiegeln(n));
        System.out.println(spiegelAddieren(n));
        while(!palindromTest(n)) {
            n = spiegelAddieren(n);
        }
        System.out.println(n);

    }
}
