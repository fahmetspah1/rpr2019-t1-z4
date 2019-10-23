package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertFalse(k.getArtikli()[0]==null);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Kolica", 1000, "2"));
        k.izbaciArtiklSaKodom("1");
        assertNull(k.getArtikli()[0]);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}