package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl [] artikli = new Artikl[1000];

    public boolean dodajArtikl (Artikl novi) {
        int i=0;
        while (artikli[i]!=null) {
            i=i+1;
        }
        artikli[i]=novi;
        return true;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        Artikl novi = new Artikl();
        int i=0;
        while (artikli[i]!=null) {
            if(kod.equals(artikli[i].getKod())) {
                novi=artikli[i];
                int j=i;
                while(artikli[j]!=null) {
                    artikli[j]=artikli[j+1];
                    j=j+1;
                }
            }
            i=i+1;
        }
        artikli[i-1]=null;
        return novi;
    }

    public Artikl [] getArtikli () {
        return artikli;
    }

}
