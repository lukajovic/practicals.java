package zadatak04;

public class OnlineProizvod implements Izracunljiv {

    private String sifra;
    private int cena;
    private int kolicina;

    public OnlineProizvod(String sifra, int cena, int kolicina) {

        this.sifra = sifra;
        this.cena = cena;
        this.kolicina = kolicina;

    }

    public String getSifru() {
        return this.sifra;
    }

    public void setSifru() {
        this.sifra = sifra;
    }

    public int getCenu() {
        return this.cena;
    }

    public void setCenu() {
        this.cena = cena;
    }

    public int getKolicinu() {
        return this.kolicina;
    }

    public void setKolicinu() {
        this.kolicina = kolicina;
    }

    @Override
    public double racunajCenu() {
        return getCenu() * getKolicinu() * 0.8;
    }
;

}
