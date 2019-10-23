package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        Artikl [] artikli = s.getArtikli();
        assertTrue(artikli[0]!=null);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s= new Supermarket();
        s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        s.dodajArtikl(new Artikl("Kolica", 1000, "2"));
        s.izbaciArtiklSaKodom("1");
        Artikl [] artikli = s.getArtikli();
        assertTrue(artikli[0]==null);
    }

}