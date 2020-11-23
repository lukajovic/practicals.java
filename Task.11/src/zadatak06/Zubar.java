package zadatak06;

import java.util.List;

public class Zubar {

    private String ime;
    private String prezime;
    public TipSmene smena;
    private List<Pacijent> listaPacijenata;

    public Zubar(String ime, String prezime, TipSmene smena, List listaPacijenata) {
        this.ime = ime;
        this.prezime = prezime;
        this.smena = smena;
        this.listaPacijenata = listaPacijenata;
    }

    public String toString() {
        return " Ime: " + this.ime + "\n" + " Prezime: " + this.prezime + "\n" + " Smena: " + this.smena + "\n" + " Lista pacijenata: " + this.listaPacijenata;
    }

    ;
    
    public String getIme() {
        return ime;
    }

    ;   public void setIme() {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    ;   public void setPrezime() {
        this.prezime = prezime;
    }

    public TipSmene getSmena() {
        return smena;
    }

    public void setSmena(TipSmene smena) {
        this.smena = smena;
    }

    public List getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata() {
        this.listaPacijenata = listaPacijenata;
    }
;
};
