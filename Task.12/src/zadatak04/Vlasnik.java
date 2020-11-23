package zadatak04;

public class Vlasnik {

    private String ime;
    private String prezime;
    private int jmbg;
    private int brojLicneKarte;

    public Vlasnik(String ime, String prezime, int jmbg, int brojLicneKarte) {

        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.brojLicneKarte = brojLicneKarte;
    }

    public String toString() {
        return " Ime: " + this.ime + "\n" + " Prezime: " + this.prezime + "\n" + " JMBG: " + this.jmbg + "\n" + " Broj licne karte: " + this.brojLicneKarte;
    }

    ;
    
    public String getIme() {
        return this.ime;
    }

    public void setIme() {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime() {
        this.prezime = prezime;
    }

    public int getJmbg() {
        return this.jmbg;
    }

    public void setJmbg() {
        this.jmbg = jmbg;
    }

    public int getBrojLicneKarte() {
        return this.brojLicneKarte;
    }

    public void setBrojLicneKarte() {
        this.brojLicneKarte = brojLicneKarte;
    }
}
