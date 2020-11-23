package zadatak04;

import java.util.List;

public class Stan extends Nekretnina {

    public Stan(String adresa, int kvadratura, List listaVlasnika) {
        super(adresa, kvadratura, listaVlasnika);
    }

    @Override
    public void racunajCenu() {
        System.out.println(1200 * this.getKvadraturu());
    }
;
}
