package zadatak04;

import java.util.List;

abstract public class Nekretnina {

    private String adresa;
    private int kvadratura;
    private List<Vlasnik> listaVlasnika;

    public Nekretnina(String adresa, int kvadratura, List listaVlasnika) {

        this.adresa = adresa;
        this.kvadratura = kvadratura;
        this.listaVlasnika = listaVlasnika;

    }

    public String toString() {
        return " Adresa: " + this.adresa + "\n" + " Kvadratura" + this.kvadratura + "\n" + "Lista Vlasnika: " + this.listaVlasnika;
    }

    ;
    
    public String getAdresu() {
        return this.adresa;
    }

    public void setAdresu() {
        this.adresa = adresa;
    }

    public int getKvadraturu() {
        return this.kvadratura;
    }

    public void setKvadraturu() {
        this.kvadratura = kvadratura;
    }

    public List getVlasnike() {
        return this.listaVlasnika;
    }

    public void setVlasnike() {
        this.listaVlasnika = listaVlasnika;
    }

    public abstract void racunajCenu();
}
