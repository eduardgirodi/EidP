public class Studierender {

    String vorname;
    String nachname;
    int matrikelnummer;
    float[] pruefungsergebnisse = new float[0];

    public Studierender(String vorname, String nachname, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    public void neueNote(float note) {
        float[] pruefungsErgebnisse = new float[pruefungsergebnisse.length +1];
        for(int i=0;i<pruefungsErgebnisse.length-1; i++) {
            pruefungsErgebnisse[i] = pruefungsergebnisse[i];
        }
        pruefungsErgebnisse[pruefungsergebnisse.length] = note;
        pruefungsergebnisse = pruefungsErgebnisse;
        getNotendurchschnitt();
    }

    public float getNotendurchschnitt() {
        float notendurchschnitt = 0.0f;
        for(int i=0; i<pruefungsergebnisse.length; i++) {
            notendurchschnitt += pruefungsergebnisse[i];
        }
        return notendurchschnitt/=pruefungsergebnisse.length;
    }

    public String toString() {
        String ergebnisse = "";
        for(int i=0; i<pruefungsergebnisse.length; i++) {
            ergebnisse += " " +pruefungsergebnisse[i];
        }
        return "Name: " +vorname +" " +nachname +", " +"Matr.Nr.: " +matrikelnummer +", " +"Ergebnisse: " +ergebnisse +" , " +"Notendurchschnitt: " +getNotendurchschnitt();
    }

    public static void main(String[] args) {
        Studierender s1 = new Studierender("Willi", "Winzig", 123456);
        Studierender s2 = new Studierender("Helga", "Hürtig", 123457);

        s1.neueNote(3.0F);
        s1.neueNote(2.3F);
        s2.neueNote(1.3F);

        System.out.println(s1);
        System.out.println(s2);
    }
}
