package ba.unsa.etf.rpr;

public class Artikl {
    public String naziv = new String ();
    public String kod = new String ();
    public int cijena;
    public Artikl () {}
    public Artikl (String naziv, String kod, int cijena) {
        Postavi(naziv,kod,cijena);
    }
    public void Postavi (String naziv, String kod, int cijena) {
        this.naziv=naziv;
        this.kod=kod;
        this.cijena=cijena;
    }

    public String getNaziv () {
        return this.naziv;
    }

    public String getKod () {
        return this.kod;
    }

    public int getCijena () {
        return this.cijena;
    }
}
