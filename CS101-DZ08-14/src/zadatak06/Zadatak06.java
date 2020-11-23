package zadatak06;

import java.util.ArrayList;
import java.util.List;

public class Zadatak06 {

    public static void main(String[] args) {
        new Zadatak06();
        
    }

    public Zadatak06() {

        List<Zubar> zubari = new ArrayList<>();
        List<Pacijent> pacijenti = new ArrayList<>();

        ZubarskaOrdinacija Belina = new ZubarskaOrdinacija("Belina", "Kralja Milana 143", zubari, pacijenti);

        Zubar Mirko = new Zubar("Mirko", "Popovic", TipSmene.PRVA_SMENA, pacijenti);
        zubari.add(Mirko);
        Zubar Dejan = new Zubar("Dejan", "Popara", TipSmene.DRUGA_SMENA, pacijenti);
        zubari.add(Dejan);
        Zubar Natasa = new Zubar("Natasa", "Markovic", TipSmene.PRVA_SMENA, pacijenti);
        zubari.add(Natasa);

        Pacijent Marko = new Pacijent("Marko", "Ivkovic", 1992, "Problem sa desnima", "Mirko");
        pacijenti.add(Marko);
        Pacijent Ivan = new Pacijent("Ivan", "Kokanovic", 1984, "Nema problema", "Natasa");
        pacijenti.add(Ivan);
        Pacijent Svetlana = new Pacijent("Svetlana", "Dejanovic", 1991, "Nema problema", "Dejan");
        pacijenti.add(Svetlana);
        
        System.out.println(Mirko.toString());
        System.out.println(Marko.toString());

    }
;
}
