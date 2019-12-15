public class WebShop {
    private final int MAX_KUNDEN = 10;
    private final int MAX_ARTIKEL = 10;
    private Kunde[] kundenArray = new Kunde[MAX_KUNDEN];
    private Artikel[] artikelArray = new Artikel[MAX_ARTIKEL];


    public void neuerArtikel(String name, double preis, int anzahl) {
        for (int i=0; i<artikelArray.length; i++) {
            if(artikelArray[i]==null){
                artikelArray[i] = new Artikel(name, preis, anzahl);
                break;
            }
        }
    }

    public Kunde neuerKunde(String vorname, String nachname) {
        Kunde neu = new Kunde(vorname, nachname);
        for(int i=0; i<kundenArray.length; i++) {
            if(this.kundenArray[i] == null) {
                this.kundenArray[i] = neu;
                break;
            }
        }
        return neu;
    }

    public Kunde neuerKunde(String vorname, String nachname, double nachlass) {
        GuterKunde neu = new GuterKunde(vorname, nachname, nachlass);
        for (int i=0; i<kundenArray.length; i++) {
            if(this.kundenArray[i] == null) {
                this.kundenArray[i] = neu;
                break;
            }
        }
        return neu;
    }

    public String bestellen(Kunde kunde, String[] artikel){
        double gesamtPreis = 0.0;
        String ergebnis = "";
        if(kunde instanceof GuterKunde) {
            ergebnis += "Rechnung fuer unseren guten Kunden " +kunde.getVorname() +" " +kunde.getNachname() + ", Preisnachlass " +((GuterKunde) kunde).getRabatt()*100 +"%:\n";
        } else {
            ergebnis += "Rechnung fuer "+kunde.getVorname() +" " +kunde.getNachname() +":\n";

        }
        for(int i=0; i<artikel.length; i++) {
            String ArtikelAktuell = artikel[i];
            for(int j=0; j<this.artikelArray.length; j++) {
                double artikelPreis = 0.0;
                if(this.artikelArray[j]==null) {
                    ergebnis += ArtikelAktuell +" : nicht gefunden\n";
                    break;
                }
                String artikelName = this.artikelArray[j].getName();
                int artikelBestand = this.artikelArray[j].getBestand();
                if(ArtikelAktuell == artikelName && artikelBestand>0) {
                    this.artikelArray[j].BestandDekr();
                    if(kunde instanceof GuterKunde) {
                        artikelPreis = this.artikelArray[j].getRabattPreis(((GuterKunde) kunde).getRabatt());
                    } else {
                        artikelPreis = this.artikelArray[j].getPreis();
                    }
                    ergebnis += artikelName +" : "+ artikelPreis+ "\n";
                    gesamtPreis += artikelPreis;
                    break;
                } else if(ArtikelAktuell == artikelName && artikelBestand <= 0) {
                    ergebnis += artikelName +" : nicht mehr vorhanden\n";
                    break;
                }
            }
        }
        ergebnis += "Gesamtpreis : " +gesamtPreis +"\n";
        return ergebnis;
    }
}
