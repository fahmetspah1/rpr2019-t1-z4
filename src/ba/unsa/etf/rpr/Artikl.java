package ba.unsa.etf.rpr;

public class Artikl {
    public String naziv = new String ();
    public String kod = new String ();
    public int cijena;
    public Artikl () {}
    public Artikl (String naziv, int cijena, String kod) {
        Postavi(naziv,cijena,kod);
    }
    public void Postavi (String naziv, int cijena, String kod) {
        this.naziv=naziv;
        this.kod=kod;
        this.cijena=cijena;
    }

    public String getNaziv () {
        return naziv;
    }

    public String getKod () {
        return kod;
    }

    public int getCijena () {
        return cijena;
    }
}
