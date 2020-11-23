package zadatak04;

import java.util.List;

public class Kuca extends Nekretnina {

    public Kuca(String adresa, int kvadratura, List listaVlasnika) {
        super(adresa, kvadratura, listaVlasnika);
    }

    public void racunajCenu() {
        System.out.println(1000 * this.getKvadraturu());
    }
}
