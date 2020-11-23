package zadatak06;

public class Pacijent {

    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private String medicinskeNapomene;
    private String zubar;

    public Pacijent(String ime, String prezime, int godinaRodjenja, String medicinskeNapomene, String zubar) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.medicinskeNapomene = medicinskeNapomene;
        this.zubar = zubar;
    }

    @Override
    public String toString() {
        return " Ime: " + this.ime + "\n" + " Prezime: " + this.prezime + "\n" + " Godina rodjenja: " + this.godinaRodjenja + "\n" + " Medicinske napomene: " + this.medicinskeNapomene + "\n" + " Zubar: " + this.zubar;
    }

    ; public void setIme() {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setPrezime() {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setGodinaRodjenja() {
        this.godinaRodjenja = godinaRodjenja;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setMedicinskeNapomene() {
        this.medicinskeNapomene = medicinskeNapomene;

    }

    public String getMedicinskeNapomene() {
        return medicinskeNapomene;
    }

    public void setZubar() {
        this.zubar = zubar;
    }

    public String getZubar() {
        return zubar;
    }

}
