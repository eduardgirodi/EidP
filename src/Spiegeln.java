public class Spiegeln {

    public static String spiegeln(String s) {
        Stack st = new Stack(s.length());
        String ergebnis = "";
        for(int i=0; i<s.length(); i++) {
            st.push(s.charAt(i));
        }
        for(int i=0; i<st.getMaxGroesse();i++) {
            ergebnis += st.pop();
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        String s = "hallo";
        System.out.println(s + " gespiegelt ist " +spiegeln(s));
    }
}
