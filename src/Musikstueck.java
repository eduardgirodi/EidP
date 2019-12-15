//package UA10;

public class Musikstueck
{
    private String[] interpreten;
    private String titel;
    private int[] toene;
    private int anzahlEinzelBewertungen;
    private int gesamtBewertung;

    public static void main(String[] args)
    {
        String[] interpreten1 = {"Wham"};
        String[] interpreten2 = {"Koelner Dompspatzen", "Heino"};
        int[] toene1 = {1,2,3,4,5,6};
        int[] toene2 = {6,5,4,3,2,1};

        Musikstueck m1 = new Musikstueck(interpreten1, "Last Christmas", toene1);
        Musikstueck m2 = new Musikstueck(interpreten2, "O Tannenbaum", toene2);

        m1.abspielen();
        m1.neueBewertung(1);
        m1.neueBewertung(1);
        m1.neueBewertung(3);
        System.out.println(m1);
        System.out.println(m2);


    }

    public Musikstueck(String[] performers, String title, int[] tunes){
        this.interpreten = performers;
        this.titel = title;
        this.toene = tunes;
        this.anzahlEinzelBewertungen = 0;
        this.gesamtBewertung = 0;
    }

    public void abspielen(){
        for (int tune : this.toene)
        {
            System.out.print(tune + " ");
        }
        System.out.println();
    }

    public void neueBewertung(int bewertung){
        this.gesamtBewertung += bewertung;
        this.anzahlEinzelBewertungen++;
    }

    public int getGesamtbewertung(){
        if(this.anzahlEinzelBewertungen == 0)return 0;
        int totalRating = (int) Math.round(((double)this.gesamtBewertung/(double)this.anzahlEinzelBewertungen));
        if(totalRating >5){totalRating = 5;}
        else if(totalRating < 1){totalRating = 1;}
        return totalRating;
    }

    public String toString(){
        int totalRating = this.getGesamtbewertung();
        String output = "Interpreten: ";
        for (String performer : this.interpreten)
        {
            output += performer +", ";
        }
        output += "Titel: " + this.titel + ", Toene: ";
        for (int tune : this.toene)
        {
            output += tune + " ";
        }
        output += ", Anz. Bewertung: " + this.anzahlEinzelBewertungen + ", Gesamtbewertung: " + totalRating;
        return output;
    }
}

