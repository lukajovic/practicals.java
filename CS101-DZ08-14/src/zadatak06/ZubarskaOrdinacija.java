package zadatak06;

import java.util.List;

public class ZubarskaOrdinacija {

    private String naziv;
    private String adresa;
    private List<Zubar> zubari;
    private List<Pacijent> pacijenti;

    public ZubarskaOrdinacija(String naziv, String adresa, List zubari, List pacijenti) {
        
        this.naziv = naziv;
        this.adresa = adresa;
        this.zubari = zubari;
        this.pacijenti = pacijenti;

    }

    ;   
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv() {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa() {
        this.adresa = adresa;
    }

    public List getZubari() {
        return zubari;
    }

    public void setZubari() {
        this.zubari = zubari;
    }

    public List getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti() {
        this.pacijenti = pacijenti;
    }

}
